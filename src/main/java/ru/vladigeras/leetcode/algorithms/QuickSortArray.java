package ru.vladigeras.leetcode.algorithms;

import java.util.List;

import static java.util.Objects.isNull;

public class QuickSortArray {

    // O(n * log(n))
    public static void quickSort(List<Integer> input) {
        if (isNull(input)) {
            return;
        }
        quickSort(input, 0, input.size() - 1);
    }

    private static void quickSort(List<Integer> input, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        Integer midVal = input.get(mid);
        int i = start, j = end;
        while (i <= j) {
            while (input.get(i).compareTo(midVal) < 0) {
                i++;
            }
            while (input.get(j).compareTo(midVal) > 0) {
                j--;
            }
            if (i <= j) {
                int temp = input.get(i);
                input.set(i, input.get(j));
                input.set(j, temp);
                i++;
                j--;
            }
        }
        if (start < j) {
            quickSort(input, start, j);
        }
        if (end > i) {
            quickSort(input, i, end);
        }
    }
}
