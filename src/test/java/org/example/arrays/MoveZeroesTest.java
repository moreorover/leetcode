package org.example.arrays;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MoveZeroes problem:
 * Given an integer array `nums`, move all zeros to the end while maintaining
 * the relative order of the non-zero elements.
 */
class MoveZeroesTest {

    @Test
    void testBasicCase() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{1, 3, 12, 0, 0},
                nums,
                "Expected [1, 3, 12, 0, 0] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testNoZeroes() {
        int[] nums = {1, 2, 3};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{1, 2, 3},
                nums,
                "Expected [1, 2, 3] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0, 0, 0};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{0, 0, 0},
                nums,
                "Expected [0, 0, 0] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testZerosAtTheStart() {
        int[] nums = {0, 0, 1, 2, 3};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{1, 2, 3, 0, 0},
                nums,
                "Expected [1, 2, 3, 0, 0] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testSingleElementZero() {
        int[] nums = {0};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{0},
                nums,
                "Expected [0] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testSingleElementNonZero() {
        int[] nums = {5};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{5},
                nums,
                "Expected [5] but got " + Arrays.toString(nums)
        );
    }

    @Test
    void testZerosScatteredWithDuplicates() {
        int[] nums = {1, 0, 2, 0, 0, 3, 0, 4};
        MoveZeroes.moveZeroes(nums);
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 0, 0, 0, 0},
                nums,
                "Expected [1, 2, 3, 4, 0, 0, 0, 0] but got " + Arrays.toString(nums)
        );
    }
}
