package org.example.easy.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class AddBinaryTest {

    @Test
    void testBasicAddition() {
        String result = AddBinary.addBinary("11", "1");
        assertEquals("100", result, "Expected '100' but got " + result);
    }

    @Test
    void testDifferentLengths() {
        String result = AddBinary.addBinary("1010", "1011");
        assertEquals("10101", result, "Expected '10101' but got " + result);
    }

    @Test
    void testBothEmpty() {
        String result = AddBinary.addBinary("", "");
        assertEquals("0", result, "Expected '0' but got " + result);
    }

    @Test
    void testOneEmpty() {
        String result = AddBinary.addBinary("101", "");
        assertEquals("101", result, "Expected '101' but got " + result);
    }

    @Test
    void testSingleBit() {
        String result = AddBinary.addBinary("1", "1");
        assertEquals("10", result, "Expected '10' but got " + result);
    }

    @Test
    void testCarryOver() {
        String result = AddBinary.addBinary("1111", "1");
        assertEquals("10000", result, "Expected '10000' but got " + result);
    }

    @Test
    void testLargeBinaryNumbers() {
        String result = AddBinary.addBinary("1010101010", "1010101010");
        assertEquals("10101010100", result, "Expected '10101010100' but got " + result);
    }
}
