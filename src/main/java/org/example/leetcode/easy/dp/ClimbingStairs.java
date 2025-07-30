package org.example.leetcode.easy.dp;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 2;
        int prev2 = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }
        return result;
    }
}
