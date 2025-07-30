package org.example.leetcode.easy.numbers;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int number = x;
        int reversed = 0;
        int remainder;

        while (number > 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }


        return x == reversed;
    }
}
