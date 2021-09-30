package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.DisappearedNumbers.findDisappearedNumbers;
import static ru.vladigeras.leetcode.patterns.DisappearedNumbers.findDisappearedNumbers2;

class DisappearedNumbersTest {

    @Test
    void shouldDisappearedNumbersEqualsTo() {
        assertEquals(List.of(5, 6), findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(List.of(2), findDisappearedNumbers(new int[]{1, 1}));

        assertEquals(List.of(5, 6), findDisappearedNumbers2(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(List.of(2), findDisappearedNumbers2(new int[]{1, 1}));
    }
}
