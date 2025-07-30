package org.example.leetcode.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @Test
    void testTargetFound() {
        int[] nums = {1, 3, 5, 6};
        int result = SearchInsertPosition.searchInsert(nums, 5);
        assertEquals(2, result, "Expected index 2 but got " + result);
    }

    @Test
    void testTargetNotFoundInsertMiddle() {
        int[] nums = {1, 3, 5, 6};
        int result = SearchInsertPosition.searchInsert(nums, 2);
        assertEquals(1, result, "Expected index 1 but got " + result);
    }

    @Test
    void testTargetNotFoundInsertEnd() {
        int[] nums = {1, 3, 5, 6};
        int result = SearchInsertPosition.searchInsert(nums, 7);
        assertEquals(4, result, "Expected index 4 but got " + result);
    }

    @Test
    void testTargetNotFoundInsertStart() {
        int[] nums = {1, 3, 5, 6};
        int result = SearchInsertPosition.searchInsert(nums, 0);
        assertEquals(0, result, "Expected index 0 but got " + result);
    }

    @Test
    void testSingleElementTargetFound() {
        int[] nums = {1};
        int result = SearchInsertPosition.searchInsert(nums, 1);
        assertEquals(0, result, "Expected index 0 but got " + result);
    }

    @Test
    void testSingleElementInsertEnd() {
        int[] nums = {1};
        int result = SearchInsertPosition.searchInsert(nums, 2);
        assertEquals(1, result, "Expected index 1 but got " + result);
    }

    @Test
    void testSingleElementInsertStart() {
        int[] nums = {1};
        int result = SearchInsertPosition.searchInsert(nums, 0);
        assertEquals(0, result, "Expected index 0 but got " + result);
    }
}
