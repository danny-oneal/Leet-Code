package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class LetterCombinationsOfAPhoneNumber {
    private static Map<String, String> digitsToChars = Map.of(
            "0", "",
            "1", "",
            "2", "abc",
            "3", "def",
            "4", "ghi",
            "5", "jkl",
            "6", "mno",
            "7", "qprs",
            "8", "tuv",
            "9", "wxyz");
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() > 0) {
            helper(0, digits, result, "");
        }
        return result;
    }

    private static void helper(int idx, String digits, List<String> result, String partial) {
        if(partial.length() == digits.length()) {
            result.add(partial);
            return;
        }

        for(char c : digitsToChars.get(String.valueOf(digits.charAt(idx))).toCharArray()) {
            helper(idx + 1, digits, result, partial + c);
        }
    }

    public static void main(String[] args) {
        System.out.println(LetterCombinationsOfAPhoneNumber.letterCombinations("23"));
    }
}
