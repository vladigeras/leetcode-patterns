package ru.vladigeras.leetcode.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.patterns.ClimbStairs.climbStairs;
import static ru.vladigeras.leetcode.patterns.ClimbStairs.climbStairs2;

class ClimbStairsTest {

    @Test
    void shouldClimbStairsEqualsTo() {
        assertEquals(2, climbStairs(2));
        assertEquals(3, climbStairs(3));
        assertEquals(5, climbStairs(4));
        assertEquals(8, climbStairs(5));
        assertEquals(34, climbStairs(8));

        assertEquals(2, climbStairs2(2));
        assertEquals(3, climbStairs2(3));
        assertEquals(5, climbStairs2(4));
        assertEquals(8, climbStairs2(5));
        assertEquals(34, climbStairs2(8));
    }
}
