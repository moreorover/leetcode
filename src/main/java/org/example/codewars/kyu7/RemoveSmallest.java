package org.example.codewars.kyu7;

public class RemoveSmallest {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length <= 1) return new int[]{};
        int currentSmallest = numbers[0];
        int indexToDrop = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < currentSmallest) {
                currentSmallest = numbers[i];
                indexToDrop = i;
            }
        }
        int[] result = new int[numbers.length - 1];

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexToDrop) continue;
            result[index++] = numbers[i];
        }
        return result;
    }
}
