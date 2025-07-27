package org.example.codewars.kyu8;

import java.util.ArrayList;

public class Digitize {
    public static int[] digitize(long n) {
        if (n == 0) return new int[]{0};
        long reduced = n;
        ArrayList<Integer> digits = new ArrayList<>();
        while (reduced > 0) {
            long rem = reduced % 10;
            digits.add((int) rem);
            reduced /= 10;
        }
        return digits.stream().mapToInt(Integer::intValue).toArray();
    }
}
