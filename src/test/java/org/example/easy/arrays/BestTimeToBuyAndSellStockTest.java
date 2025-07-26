package org.example.easy.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    @Test
    void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testDecreasingPrices() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    void testMixedPrices() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
