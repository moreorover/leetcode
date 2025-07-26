package org.example.easy.numbers;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            int value = map.get(chars[i]);

            if (i + 1 < chars.length) {
                if (value < map.get(chars[i + 1])) {
                    result -= value;
                }
                if (value >= map.get(chars[i + 1])) {
                    result += value;
                }
            } else {
                result += value;
            }
        }
        return result;
    }
}
