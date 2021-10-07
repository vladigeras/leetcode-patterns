package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.vladigeras.leetcode.patterns.CountingBits.countBits;
import static ru.vladigeras.leetcode.patterns.CountingBits.countBits2;

class CountingBitsTest {

    @Test
    void shouldCountingBitsqualsTo() {
        assertArrayEquals(new int[]{0, 1, 1}, countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countBits(5));

        assertArrayEquals(new int[]{0, 1, 1}, countBits2(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countBits2(5));
    }
}
