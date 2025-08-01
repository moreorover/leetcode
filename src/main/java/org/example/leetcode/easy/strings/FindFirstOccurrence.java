package org.example.leetcode.easy.strings;

public class FindFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        if (haystack.isEmpty()) return -1;
        if (needle.length() > haystack.length()) return -1;
        if (needle.isEmpty()) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle)) return i;
        }

        return -1;

//        return haystack.indexOf(needle);
    }
}
