package org.example.codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
