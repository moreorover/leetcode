package org.example.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveSmallestTest {

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{}, result,
                "Expected empty array for empty input");
    }

    @Test
    void testSingleElement() {
        int[] input = {5};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{}, result,
                "Expected empty array after removing the only element");
    }

    @Test
    void testBasicCase() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{2, 3, 4, 5}, result,
                "Expected smallest element 1 removed");
    }

    @Test
    void testSmallestInMiddle() {
        int[] input = {5, 3, 2, 1, 4};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{5, 3, 2, 4}, result,
                "Expected smallest element 1 removed");
    }

    @Test
    void testMultipleMinOccurrences() {
        int[] input = {2, 2, 1, 2, 1};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{2, 2, 2, 1}, result,
                "Expected only the first 1 removed");
    }

    @Test
    void testAllEqual() {
        int[] input = {7, 7, 7, 7};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{7, 7, 7}, result,
                "Expected one occurrence removed even if all elements are equal");
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-1, -3, -2, -3};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{-1, -2, -3}, result,
                "Expected the first -3 removed");
    }

    @Test
    void testMixedPositiveAndNegative() {
        int[] input = {3, -5, 7, -5, 2};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{3, 7, -5, 2}, result,
                "Expected the first -5 removed");
    }

    @Test
    void testMinAtEnd() {
        int[] input = {5, 4, 3, 2, 1};
        int[] result = RemoveSmallest.removeSmallest(input);
        assertArrayEquals(new int[]{5, 4, 3, 2}, result,
                "Expected smallest element 1 removed from end");
    }
}
