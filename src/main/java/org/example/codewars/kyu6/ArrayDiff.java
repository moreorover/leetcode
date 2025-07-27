package org.example.codewars.kyu6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0 || a.length == 0) return a;

        Set<Integer> set = new HashSet<>();
        for (int num : b) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
