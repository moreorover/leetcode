package org.example.easy.strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int lastSpace = s.lastIndexOf(' ');
        return s.length() - lastSpace - 1;
    }
}
