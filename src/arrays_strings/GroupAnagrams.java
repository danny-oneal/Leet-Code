package arrays_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> anagramMap = new HashMap<>();
        for(String str : strs) {
            int[] charCnt = new int[26];
            char[] strChars = str.toCharArray();
            String key = "";
            for(char strChar : strChars) {
                int charIdx = strChar - 'a';
                charCnt[charIdx]++;
            }
            for(int i = 0; i < 26; i++) {
                if(charCnt[i] > 0) {
                    key += i + "_" + charCnt[i];
                }
            }
            System.out.println(key);
            if(anagramMap.containsKey(key)) {
                List<String> currList = anagramMap.get(key);
                currList.add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                anagramMap.put(key, newList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List list : anagramMap.values()) {
            result.add(list);
        }
        return result;
    }
}
