package ru.vladigeras.leetcode.patterns;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        final int[] sum = {0};
        final int[] refSum = {0};
        Arrays.stream(nums).boxed().peek(i -> sum[0] += i).distinct().forEach(i -> refSum[0] = refSum[0] + (i * 2));
        return refSum[0] - sum[0];
    }

    public static int singleNumber2(int[] nums) {
        var unique = new HashSet<Integer>();
        var sum = 0;
        var refSum = 0;
        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
                refSum = refSum + (num * 2);
            }
            sum = sum + num;
        }
        return refSum - sum;
    }

    public static int singleNumber3(int[] nums) {
        return Arrays.stream(nums).boxed().reduce(0, (x, y) -> x ^ y);
    }
}
