package ru.vladigeras.leetcode.patterns;

public class RangeSumQuery {

    static class NumArray {

        private final int[] sum;

        public NumArray(int[] nums) {
            var sum = new int[nums.length];
            var currSum = 0;
            for (int i = 0; i < nums.length; i++) {
                currSum += nums[i];
                sum[i] += currSum;
            }
            this.sum = sum;
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return sum[right];
            }
            return sum[right] - sum[left - 1];
        }
    }
}
