package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;
import ru.vladigeras.leetcode.patterns.RangeSumQuery.NumArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumQueryTest {

    @Test
    void shouldMaxProfitEqualsTo() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1, 7, 4, 3});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(10, numArray.sumRange(2, 7));
        assertEquals(13, numArray.sumRange(5, 8));
    }
}
