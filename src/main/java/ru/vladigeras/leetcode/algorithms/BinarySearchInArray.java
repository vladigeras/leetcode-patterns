package ru.vladigeras.leetcode.algorithms;

import java.util.List;

import static java.util.Objects.isNull;

public class BinarySearchInArray {

    public static int binarySearch(List<Integer> input, Integer value) {
        if (isNull(input) || input.isEmpty()) {
            return -1;
        }
        int start = 0;
        int end = input.size() - 1;
        if (value.compareTo(input.get(start)) < 0 || value.compareTo(input.get(end)) > 0) {
            return -1;
        }
        while (start <= end) {
            int mid = (end + start) / 2;
            Integer midVal = input.get(mid);
            if (value.compareTo(midVal) == 0) {
                return mid;
            }
            if (value.compareTo(midVal) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
