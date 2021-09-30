package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.MissingNumber.missingNumber;

class MissingNumberTest {

    @Test
    void shouldMissingNumberEqualsTo() {
        assertEquals(2, missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, missingNumber(new int[]{0, 1}));
        assertEquals(8, missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        assertEquals(1, missingNumber(new int[]{0}));
    }
}
