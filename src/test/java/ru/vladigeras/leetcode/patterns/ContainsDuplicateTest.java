package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.vladigeras.leetcode.patterns.ContainsDuplicate.containsDuplicate;

class ContainsDuplicateTest {

    @Test
    void shouldContainsDuplicateNumber() {
        assertTrue(containsDuplicate(new int[]{1, 2, 3, 2}));
    }

    @Test
    void shouldNotContainsDuplicateNumber() {
        assertFalse(containsDuplicate(new int[]{1, 2, 3}));
    }
}
