package ru.vladigeras.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.algorithms.BinarySearchInArray.binarySearch;

class BinarySearchInArrayTest {

    @Test
    void shouldSearchInArray() {
        List<Integer> input = IntStream.range(0, 1000000).boxed().collect(Collectors.toList());
        assertEquals(5, binarySearch(input, 5));
        assertEquals(112, binarySearch(input, 112));
        assertEquals(-1, binarySearch(input, 10000001));
        assertEquals(-1, binarySearch(input, -30));
    }
}
