package org.example.leetcode.easy.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void testSingleSymbols() {
        assertEquals(1, RomanToInteger.romanToInt("I"), "I should be 1");
        assertEquals(5, RomanToInteger.romanToInt("V"), "V should be 5");
        assertEquals(10, RomanToInteger.romanToInt("X"), "X should be 10");
        assertEquals(50, RomanToInteger.romanToInt("L"), "L should be 50");
        assertEquals(100, RomanToInteger.romanToInt("C"), "C should be 100");
        assertEquals(500, RomanToInteger.romanToInt("D"), "D should be 500");
        assertEquals(1000, RomanToInteger.romanToInt("M"), "M should be 1000");
    }

    @Test
    void testSimpleAdditiveCases() {
        assertEquals(3, RomanToInteger.romanToInt("III"), "III should be 3");
        assertEquals(6, RomanToInteger.romanToInt("VI"), "VI should be 6");
        assertEquals(15, RomanToInteger.romanToInt("XV"), "XV should be 15");
        assertEquals(30, RomanToInteger.romanToInt("XXX"), "XXX should be 30");
    }

    @Test
    void testSubtractiveCases() {
        assertEquals(4, RomanToInteger.romanToInt("IV"), "IV should be 4");
        assertEquals(9, RomanToInteger.romanToInt("IX"), "IX should be 9");
        assertEquals(40, RomanToInteger.romanToInt("XL"), "XL should be 40");
        assertEquals(90, RomanToInteger.romanToInt("XC"), "XC should be 90");
        assertEquals(400, RomanToInteger.romanToInt("CD"), "CD should be 400");
        assertEquals(900, RomanToInteger.romanToInt("CM"), "CM should be 900");
    }

    @Test
    void testComplexCases() {
        assertEquals(58, RomanToInteger.romanToInt("LVIII"), "LVIII should be 58 (50 + 5 + 3)");
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"), "MCMXCIV should be 1994");
        assertEquals(2023, RomanToInteger.romanToInt("MMXXIII"), "MMXXIII should be 2023");
    }

    @Test
    void testEdgeCases() {
        assertEquals(1, RomanToInteger.romanToInt("I"), "I should be 1");
        assertEquals(3999, RomanToInteger.romanToInt("MMMCMXCIX"), "MMMCMXCIX should be 3999 (max standard Roman numeral)");
    }
}
