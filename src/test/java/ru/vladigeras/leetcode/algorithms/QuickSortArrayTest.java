package ru.vladigeras.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.algorithms.QuickSortArray.quickSort;

class QuickSortArrayTest {

    @Test
    void shouldSortArray() {
        int size = 1000000;
        List<Integer> input = new ArrayList<>(size);
        for (int i = size; i >= 0; i--) {
            input.add(i);
        }
        quickSort(input);
        assertEquals(IntStream.rangeClosed(0, size).boxed().collect(Collectors.toList()), input);
    }
}
