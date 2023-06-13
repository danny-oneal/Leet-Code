package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class InsertDeleteGetRandom {
    ThreadLocalRandom threadLocalRandom;
    List<Integer> items;
    Map<Integer, Integer> map;

    public InsertDeleteGetRandom() {
        threadLocalRandom = ThreadLocalRandom.current();
        items = new ArrayList<>();
        map = new HashMap<>();
    }

    boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        } else {
            map.put(val, items.size());
            items.add(val);
            return true;
        }
    }

    boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        } else {
            int index = map.get(val);
            int lastItem = items.get(items.size() - 1);
            items.set(index, lastItem);
            items.remove(items.size() - 1);
            map.put(lastItem, index);
            map.remove(val);
            return true;
        }
    }

    int getRandom() {
        int index = threadLocalRandom.nextInt(0, items.size());
        return items.get(index);
    }
}
