package org.example.codewars;

public class EasyTasks {
    public static String sentenceSmash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
