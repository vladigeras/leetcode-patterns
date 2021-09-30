package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.BuyAndSellStock.maxProfit;

class BuyAndSellStockTest {

    @Test
    void shouldMaxProfitEqualsTo() {
        assertEquals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
