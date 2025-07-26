package org.example.easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    @Test
    void testBasicCase() {
        int result = LengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result, "Expected 5 but got " + result);
    }

    @Test
    void testSingleWord() {
        int result = LengthOfLastWord.lengthOfLastWord("Hello");
        assertEquals(5, result, "Expected 5 but got " + result);
    }

    @Test
    void testTrailingSpaces() {
        int result = LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, result, "Expected 4 but got " + result);
    }

    @Test
    void testOnlySpaces() {
        int result = LengthOfLastWord.lengthOfLastWord("     ");
        assertEquals(0, result, "Expected 0 but got " + result);
    }

    @Test
    void testWordWithSingleCharacter() {
        int result = LengthOfLastWord.lengthOfLastWord("a ");
        assertEquals(1, result, "Expected 1 but got " + result);
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        int result = LengthOfLastWord.lengthOfLastWord("Hello   there   ");
        assertEquals(5, result, "Expected 5 but got " + result);
    }

    @Test
    void testEmptyString() {
        int result = LengthOfLastWord.lengthOfLastWord("");
        assertEquals(0, result, "Expected 0 but got " + result);
    }
}
