package org.example.easy.arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
            if (i + 1 < nums.length) {
                if (target < nums[i + 1]) return i + 1;
            } else {
                return i + 1;
            }
        }
        return -1;
    }
}