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

    public static String fakeBin(String numberString) {
        String result = numberString;
        result = result.replace("1", "0");
        result = result.replace("2", "0");
        result = result.replace("3", "0");
        result = result.replace("4", "0");
        result = result.replace("5", "1");
        result = result.replace("6", "1");
        result = result.replace("7", "1");
        result = result.replace("8", "1");
        result = result.replace("9", "1");
        return result;
    }

    public static String printerError(String s) {
        long count = s.chars().filter(c -> c > 'm').count();
        return count + "/" + s.length();
    }
}
