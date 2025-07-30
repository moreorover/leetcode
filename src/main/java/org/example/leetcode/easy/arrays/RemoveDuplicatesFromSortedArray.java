package org.example.leetcode.easy.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (fast + 1 < nums.length) {
                if (nums[fast] != nums[fast + 1]) {
                    nums[count] = nums[fast];
                    count++;
                }
            } else {
                nums[count] = nums[fast];
                count++;
            }
        }
        return count;
    }
}
