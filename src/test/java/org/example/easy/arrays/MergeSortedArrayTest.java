package org.example.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void testBasicMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testNums1SmallerElements() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void testNums2SmallerElements() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void testEmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        MergeSortedArray.merge(nums1, 3, nums2, 0);
        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    void testEmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArray.merge(nums1, 0, nums2, 3);
        assertArrayEquals(new int[]{2, 5, 6}, nums1);
    }

    @Test
    void testWithDuplicates() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int[] nums2 = {2, 2, 3};
        MergeSortedArray.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 2, 2, 3}, nums1);
    }
}
