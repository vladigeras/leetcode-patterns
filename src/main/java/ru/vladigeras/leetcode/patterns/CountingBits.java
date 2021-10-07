package ru.vladigeras.leetcode.patterns;

public class CountingBits {

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }

    public static int[] countBits2(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i % 2);;
        }
        return result;
    }
}
