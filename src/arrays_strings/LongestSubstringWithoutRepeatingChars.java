package arrays_strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxCnt = 0;
        HashSet<Character> hashSet = new HashSet<>();
        int sLen = s.length();
        while(j < sLen) {
            char currChar = s.charAt(j);
            if(!hashSet.contains(currChar)) {
                hashSet.add(currChar);
                j++;
                if(j - i > maxCnt) maxCnt = j - i;
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return maxCnt;
    }
}
