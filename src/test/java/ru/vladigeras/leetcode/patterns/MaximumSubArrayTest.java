package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.MaximumSubArray.maxSubArray;

class MaximumSubArrayTest {

    @Test
    void shouldMaxSubArrayEqualsTo() {
        assertEquals(6, maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, maxSubArray(new int[]{1}));
        assertEquals(23, maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
