package ru.vladigeras.leetcode.patterns;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        var sum = 0;
        for (int num : nums) {
            sum += num;
        }
        var count = nums.length;
        return (count * (count + 1) / 2) - sum;
    }
}
