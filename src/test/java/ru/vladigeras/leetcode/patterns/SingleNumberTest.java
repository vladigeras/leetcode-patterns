package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.DisappearedNumbers.findDisappearedNumbers;
import static ru.vladigeras.leetcode.patterns.DisappearedNumbers.findDisappearedNumbers2;
import static ru.vladigeras.leetcode.patterns.SingleNumber.singleNumber;
import static ru.vladigeras.leetcode.patterns.SingleNumber.singleNumber2;

class SingleNumberTest {

    @Test
    void shouldSingleNumberEqualsTo() {
        assertEquals(1, singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, singleNumber(new int[]{1}));

        assertEquals(1, singleNumber2(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber2(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, singleNumber2(new int[]{1}));
    }
}
