package org.example.leetcode.easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstOccurrenceTest {

    @Test
    void testBasicCase() {
        int result = FindFirstOccurrence.strStr("sadbutsad", "sad");
        assertEquals(0, result, "Expected index 0 but got " + result);
    }

    @Test
    void testSecondOccurrence() {
        int result = FindFirstOccurrence.strStr("mississippi", "issip");
        assertEquals(4, result, "Expected index 4 but got " + result);
    }

    @Test
    void testNoMatch() {
        int result = FindFirstOccurrence.strStr("leetcode", "leeto");
        assertEquals(-1, result, "Expected -1 but got " + result);
    }

    @Test
    void testFullMatch() {
        int result = FindFirstOccurrence.strStr("abc", "abc");
        assertEquals(0, result, "Expected index 0 but got " + result);
    }

    @Test
    void testNeedleLongerThanHaystack() {
        int result = FindFirstOccurrence.strStr("a", "abc");
        assertEquals(-1, result, "Expected -1 but got " + result);
    }

    @Test
    void testEmptyNeedle() {
        int result = FindFirstOccurrence.strStr("hello", "");
        assertEquals(0, result, "Expected 0 when needle is empty");
    }

    @Test
    void testEmptyHaystack() {
        int result = FindFirstOccurrence.strStr("", "a");
        assertEquals(-1, result, "Expected -1 when haystack is empty");
    }
}
