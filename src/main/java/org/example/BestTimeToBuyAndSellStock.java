package org.example;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            if (current < min) {
                min = current;
                continue;
            }
            int tempProfit = current - min;
            if (tempProfit > profit) {
                profit = tempProfit;
            }
        }
        return profit; // placeholder
    }
}
