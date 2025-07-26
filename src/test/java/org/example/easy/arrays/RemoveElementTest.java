package org.example.easy.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void testBasicCase() {
        int[] nums = {3, 2, 2, 3};
        int k = RemoveElement.removeElement(nums, 3);
        assertEquals(2, k, "Expected length 2 but got " + k);
        int[] expected = {2, 2};
        assertArrayEquals(expected, Arrays.copyOf(nums, k),
                "Expected [2, 2] but got " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    @Test
    void testNoOccurrences() {
        int[] nums = {1, 2, 3, 4};
        int k = RemoveElement.removeElement(nums, 5);
        assertEquals(4, k, "Expected length 4 but got " + k);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, Arrays.copyOf(nums, k));
    }

    @Test
    void testAllOccurrences() {
        int[] nums = {2, 2, 2};
        int k = RemoveElement.removeElement(nums, 2);
        assertEquals(0, k, "Expected length 0 but got " + k);
    }

    @Test
    void testSingleElementToRemove() {
        int[] nums = {5};
        int k = RemoveElement.removeElement(nums, 5);
        assertEquals(0, k, "Expected length 0 but got " + k);
    }

    @Test
    void testSingleElementToKeep() {
        int[] nums = {5};
        int k = RemoveElement.removeElement(nums, 1);
        assertEquals(1, k, "Expected length 1 but got " + k);
        assertArrayEquals(new int[]{5}, Arrays.copyOf(nums, k));
    }

    @Test
    void testMixedValues() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = RemoveElement.removeElement(nums, 2);
        assertEquals(5, k, "Expected length 5 but got " + k);
        int[] expected = {0, 1, 3, 0, 4};
        assertArrayEquals(expected, Arrays.copyOf(nums, k),
                "Expected [0, 1, 3, 0, 4] but got " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
