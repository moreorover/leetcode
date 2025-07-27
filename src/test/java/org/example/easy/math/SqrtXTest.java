package org.example.easy.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtXTest {

    @Test
    void testPerfectSquares() {
        assertEquals(2, SqrtX.mySqrt(4), "Expected sqrt(4) = 2");
        assertEquals(3, SqrtX.mySqrt(9), "Expected sqrt(9) = 3");
        assertEquals(5, SqrtX.mySqrt(25), "Expected sqrt(25) = 5");
        assertEquals(10, SqrtX.mySqrt(100), "Expected sqrt(100) = 10");
        assertEquals(46340, SqrtX.mySqrt(2147395600), "Expected sqrt(2147395600) = 46340");
    }

    @Test
    void testNonPerfectSquares() {
        assertEquals(2, SqrtX.mySqrt(8), "Expected sqrt(8) = 2 (floor)");
        assertEquals(3, SqrtX.mySqrt(10), "Expected sqrt(10) = 3 (floor)");
        assertEquals(4, SqrtX.mySqrt(24), "Expected sqrt(24) = 4 (floor)");
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, SqrtX.mySqrt(0), "Expected sqrt(0) = 0");
        assertEquals(1, SqrtX.mySqrt(1), "Expected sqrt(1) = 1");
    }

    @Test
    void testLargeNumber() {
        assertEquals(46339, SqrtX.mySqrt(2147395599),
                "Expected sqrt(2147395599) = 46339 (floor)");
    }
}
