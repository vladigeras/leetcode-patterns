package ru.vladigeras.leetcode.patterns;

public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        var maxSum = nums[0];
        var currentSum = maxSum;
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
