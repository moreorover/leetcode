package org.example.leetcode.easy.strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length() <= i) return result.toString();

                if (str.charAt(i) != temp) {
                    return result.toString();
                }
            }
            result.append(temp);
        }
        return result.toString();
    }
}
