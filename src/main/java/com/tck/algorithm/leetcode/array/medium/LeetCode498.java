package com.tck.algorithm.leetcode.array.medium;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/leetbook/read/array-and-string/cuxq3/
 * <p>
 * https://leetcode-cn.com/problems/diagonal-traverse/
 * 498. 对角线遍历
 */
public class LeetCode498 {
    public int[] findDiagonalOrder(int[][] mat) {

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("498. 对角线遍历");
        System.out.println("输入:[[1,2,3],[4,5,6],[7,8,9]]");
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("期待输出:[1,2,4,7,5,3,6,8,9],实际输出:" + Arrays.toString(new LeetCode498().findDiagonalOrder(ints)));

        System.out.println("输入:[[1,2],[3,4]]");
        System.out.println("期待输出:[1,2,3,4],实际输出:" + Arrays.toString(new LeetCode498().findDiagonalOrder(new int[][]{{1, 2}, {3, 4}})));

    }
}
