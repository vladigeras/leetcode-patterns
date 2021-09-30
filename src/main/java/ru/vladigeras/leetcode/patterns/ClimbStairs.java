package ru.vladigeras.leetcode.patterns;

public class ClimbStairs {

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        var n1 = 1;
        var n2 = 2;
        for (int i = 3; i < n + 1; i++) {
            var temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        return n2;
    }

    public static int climbStairs2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs2(n - 2) + climbStairs2(n - 1);
    }
}
