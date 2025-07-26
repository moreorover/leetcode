package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 1, 2};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(2, k, "Expected length 2 but got " + k);
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(nums, k),
                "Expected [1, 2] but got " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    @Test
    void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(5, k, "Expected length 5 but got " + k);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arrays.copyOf(nums, k));
    }

    @Test
    void testAllDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(1, k, "Expected length 1 but got " + k);
        assertArrayEquals(new int[]{2}, Arrays.copyOf(nums, k));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(0, k, "Expected length 0 but got " + k);
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(1, k, "Expected length 1 but got " + k);
        assertArrayEquals(new int[]{5}, Arrays.copyOf(nums, k));
    }

    @Test
    void testLargeArrayWithDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(5, k, "Expected length 5 but got " + k);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOf(nums, k));
    }
}
