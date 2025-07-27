package org.example.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayDiffTest {

    @Test
    void testEmptyA() {
        int[] a = {};
        int[] b = {1, 2, 3};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{}, result, "Empty a should return empty array");
    }

    @Test
    void testEmptyB() {
        int[] a = {1, 2, 3};
        int[] b = {};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 2, 3}, result, "Empty b should return a unchanged");
    }

    @Test
    void testNoOverlap() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void testRemoveAll() {
        int[] a = {1, 2, 2, 3};
        int[] b = {1, 2, 3};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{}, result, "Should remove all elements that appear in b");
    }

    @Test
    void testPartialOverlap() {
        int[] a = {1, 2, 2, 2, 3};
        int[] b = {2};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 3}, result, "Multiple occurrences of 2 should all be removed");
    }

    @Test
    void testMixed() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 3, 5}, result);
    }

    @Test
    void testDuplicatesInA() {
        int[] a = {1, 1, 2, 2, 3};
        int[] b = {1};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{2, 2, 3}, result, "All 1s removed, rest preserved with duplicates");
    }

    @Test
    void testDuplicatesInBoth() {
        int[] a = {1, 2, 2, 3};
        int[] b = {2, 2};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 3}, result, "Removing by set semantics, duplicates in b treated same");
    }

    @Test
    void testAllRemoved() {
        int[] a = {0, 0, 0};
        int[] b = {0};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testUnorderedB() {
        int[] a = {3, 5, 1, 5, 2};
        int[] b = {5, 3};
        int[] result = ArrayDiff.arrayDiff(a, b);
        assertArrayEquals(new int[]{1, 2}, result, "Removal should work even if b is unsorted");
    }
}
