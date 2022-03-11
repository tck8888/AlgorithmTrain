package com.tck.algorithm.leetcode.offer.easy;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class Fib {

    /**
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public int fib2(int n) {
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

    public int fib1(int n) {
        if (n < 2) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2)) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib2(2));
        System.out.println(new Fib().fib2(5));
    }
}
