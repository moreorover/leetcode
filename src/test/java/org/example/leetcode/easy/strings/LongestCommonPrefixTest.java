package org.example.leetcode.easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void testBasicCase() {
        String[] input = {"flower", "flow", "flight"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("fl", result, "Expected 'fl' but got: " + result);
    }

    @Test
    void testNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("", result, "Expected '' but got: " + result);
    }

    @Test
    void testAllStringsSame() {
        String[] input = {"test", "test", "test"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("test", result, "Expected 'test' but got: " + result);
    }

    @Test
    void testSingleString() {
        String[] input = {"alone"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("alone", result, "Expected 'alone' but got: " + result);
    }

    @Test
    void testEmptyStringInArray() {
        String[] input = {"", "b", "c"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("", result, "Expected '' but got: " + result);
    }

    @Test
    void testCommonPrefixEntireString() {
        String[] input = {"carpet", "carpool", "car"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("car", result, "Expected 'car' but got: " + result);
    }

    @Test
    void testPrefixWithSingleCharacter() {
        String[] input = {"a", "ab", "abc"};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("a", result, "Expected 'a' but got: " + result);
    }

    @Test
    void testEmptyArray() {
        String[] input = {};
        String result = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("", result, "Expected '' but got: " + result);
    }
}
