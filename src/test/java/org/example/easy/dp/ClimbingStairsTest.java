package org.example.easy.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void testBaseCases() {
        assertEquals(1, ClimbingStairs.climbStairs(1), "For 1 step, there is 1 way.");
        assertEquals(2, ClimbingStairs.climbStairs(2), "For 2 steps, there are 2 ways: [1+1, 2].");
    }

    @Test
    void testSmallValues() {
        assertEquals(3, ClimbingStairs.climbStairs(3), "For 3 steps, ways: [1+1+1, 1+2, 2+1].");
        assertEquals(5, ClimbingStairs.climbStairs(4), "For 4 steps, ways: 5.");
        assertEquals(8, ClimbingStairs.climbStairs(5), "For 5 steps, ways: 8.");
    }

    @Test
    void testLargerValue() {
        assertEquals(21, ClimbingStairs.climbStairs(7), "For 7 steps, ways: 21.");
    }

    @Test
    void testEdgeCaseZeroSteps() {
        assertEquals(0, ClimbingStairs.climbStairs(0), "For 0 steps, no way to climb.");
    }
}
