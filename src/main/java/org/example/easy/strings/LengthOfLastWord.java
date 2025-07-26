package org.example.easy.strings;

import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] x = s.split(" ");
        String[] c = Arrays.stream(x).filter(v -> !v.isBlank()).map(String::trim).toArray(String[]::new);
        return c[c.length - 1].length();
    }
}
