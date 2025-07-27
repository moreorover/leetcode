package org.example.codewars.kyu8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DigitizeTest {

    @Test
    void testBasicCase() {
        long input = 35231;
        int[] result = Digitize.digitize(input);
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, result,
                "Expected [1, 3, 2, 5, 3] but got " + Arrays.toString(result));
    }

    @Test
    void testSingleDigit() {
        long input = 7;
        int[] result = Digitize.digitize(input);
        assertArrayEquals(new int[]{7}, result,
                "Expected [7] but got " + Arrays.toString(result));
    }

    @Test
    void testZero() {
        long input = 0;
        int[] result = Digitize.digitize(input);
        assertArrayEquals(new int[]{0}, result,
                "Expected [0] but got " + Arrays.toString(result));
    }

    @Test
    void testZeroInMiddle() {
        long input = 101;
        int[] result = Digitize.digitize(input);
        assertArrayEquals(new int[]{1, 0, 1}, result,
                "Expected [1, 0, 1] but got " + Arrays.toString(result));
    }

    @Test
    void testLargeNumber() {
        long input = 9876543210L;
        int[] result = Digitize.digitize(input);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, result,
                "Expected [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] but got " + Arrays.toString(result));
    }
}
