package org.example.easy.dp;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += n - i;
        }
        return result;
    }
}
