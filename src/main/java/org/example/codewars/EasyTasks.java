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

    public static String getMiddle(String word) {
        String[] w = word.split("");
        if (word.length() % 2 == 1) {
            int index = (word.length() - 1) / 2;
            return w[index];
        }

        int half = word.length() / 2 - 1;

        return w[half] + w[half + 1];
    }
}
