package com.tck.algorithm.leetcode.offer.easy;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class NumWays {

    /**
     * 0 1
     * 1 1
     * 2 1+1
     * 3 2+1
     * 7
     *
     * @param n
     * @return
     */
    public int numWays(int n) {

        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }

    public int numWays2(int n) {
        if (n <= 2) {
            if (n == 0) {
                return 1;
            }
            return n;
        }

        return (numWays(n - 1) + numWays(n - 2)) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new NumWays().numWays(0));
        System.out.println(new NumWays().numWays(1));
        System.out.println(new NumWays().numWays(2));
        System.out.println(new NumWays().numWays(3));
        System.out.println(new NumWays().numWays(4));
        System.out.println(new NumWays().numWays(5));
        System.out.println(new NumWays().numWays(6));
        System.out.println(new NumWays().numWays(7));
    }
}
