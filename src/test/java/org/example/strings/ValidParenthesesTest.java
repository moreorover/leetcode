package org.example.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void testBasicValidCases() {
        assertTrue(ValidParentheses.isValid("()"), "Expected '()' to be valid");
        assertTrue(ValidParentheses.isValid("()[]{}"), "Expected '()[]{}' to be valid");
        assertTrue(ValidParentheses.isValid("{[]}"), "Expected '{[]}' to be valid");
    }

    @Test
    void testBasicInvalidCases() {
        assertFalse(ValidParentheses.isValid("(]"), "Expected '(]' to be invalid");
        assertFalse(ValidParentheses.isValid("([)]"), "Expected '([)]' to be invalid");
        assertFalse(ValidParentheses.isValid("{[}"), "Expected '{[}' to be invalid");
        assertFalse(ValidParentheses.isValid(")("), "Expected ')(' to be invalid");
        assertFalse(ValidParentheses.isValid("([)]"), "Expected '([)]' to be invalid");
    }

    @Test
    void testSingleCharacter() {
        assertFalse(ValidParentheses.isValid("("), "Expected '(' to be invalid");
        assertFalse(ValidParentheses.isValid("]"), "Expected ']' to be invalid");
    }

    @Test
    void testEmptyString() {
        assertTrue(ValidParentheses.isValid(""), "Expected empty string to be valid");
    }

    @Test
    void testLongValidString() {
        String input = "({[({[]})]})";
        assertTrue(ValidParentheses.isValid(input), "Expected '" + input + "' to be valid");
    }

    @Test
    void testLongInvalidString() {
        String input = "({[({[})]})";
        assertFalse(ValidParentheses.isValid(input), "Expected '" + input + "' to be invalid");
    }
}
