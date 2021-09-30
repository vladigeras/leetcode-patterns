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

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        var i = 0;
        var position = 0;
        while (i < nums.length) {
            position = nums[i] - 1;
            if (nums[i] != nums[position]) {
                var temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
            } else {
                i += 1;
            }
        }

        var missing = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missing.add(j + 1);
            }
        }
        return missing;
    }

}
