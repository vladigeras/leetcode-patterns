package ru.vladigeras.leetcode.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        var range = IntStream.range(1, nums.length + 1).boxed().collect(Collectors.toSet());
        var uniqueCurrent = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        range.removeAll(uniqueCurrent);
        return new ArrayList<>(range);
    }
}
