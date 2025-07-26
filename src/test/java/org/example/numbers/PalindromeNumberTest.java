package org.example.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Palindrome Number tests:
 * A number is a palindrome if it reads the same forward and backward.
 */
class PalindromeNumberTest {

    @Test
    void testPositivePalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(121), "Expected 121 to be a palindrome");
    }

    @Test
    void testNegativeNumber() {
        assertFalse(PalindromeNumber.isPalindrome(-121), "Expected -121 not to be a palindrome");
    }

    @Test
    void testNumberEndingWithZero() {
        assertFalse(PalindromeNumber.isPalindrome(10), "Expected 10 not to be a palindrome");
    }

    @Test
    void testSingleDigit() {
        assertTrue(PalindromeNumber.isPalindrome(7), "Expected 7 to be a palindrome");
    }

    @Test
    void testLargePalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(1234321), "Expected 1234321 to be a palindrome");
    }

    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeNumber.isPalindrome(123), "Expected 123 not to be a palindrome");
    }

    @Test
    void testZero() {
        assertTrue(PalindromeNumber.isPalindrome(0), "Expected 0 to be a palindrome");
    }
}
