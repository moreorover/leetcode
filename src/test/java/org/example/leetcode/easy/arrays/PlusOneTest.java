package org.example.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    @Test
    void testBasicCase() {
        int[] digits = {1, 2, 3};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 2, 4}, result,
                "Expected [1, 2, 4] but got " + Arrays.toString(result));
    }

    @Test
    void testCarryOver() {
        int[] digits = {1, 2, 9};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 3, 0}, result,
                "Expected [1, 3, 0] but got " + Arrays.toString(result));
    }

    @Test
    void testNoCarryOver() {
        int[] digits = {1, 2, 8};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 2, 9}, result,
                "Expected [1, 2, 9] but got " + Arrays.toString(result));
    }

    @Test
    void testAllNines() {
        int[] digits = {9, 9, 9};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 0, 0, 0}, result,
                "Expected [1, 0, 0, 0] but got " + Arrays.toString(result));
    }

    @Test
    void testSingleDigit() {
        int[] digits = {0};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1}, result,
                "Expected [1] but got " + Arrays.toString(result));
    }

    @Test
    void testSingleNine() {
        int[] digits = {9};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 0}, result,
                "Expected [1, 0] but got " + Arrays.toString(result));
    }

    @Test
    void testLargeNumber() {
        int[] digits = {4, 3, 2, 1};
        int[] result = PlusOne.plusOne(digits);
        assertArrayEquals(new int[]{4, 3, 2, 2}, result,
                "Expected [4, 3, 2, 2] but got " + Arrays.toString(result));
    }
}
