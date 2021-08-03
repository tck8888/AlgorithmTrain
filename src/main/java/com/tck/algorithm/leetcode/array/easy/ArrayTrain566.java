package com.tck.algorithm.leetcode.array.easy;

import com.tck.algorithm.leetcode.linkedlist.Train876;

import java.util.Arrays;

public class ArrayTrain566 {

    /**
     * https://leetcode-cn.com/problems/reshape-the-matrix/
     * https://leetcode-cn.com/problems/reshape-the-matrix/solution/zhong-su-ju-zhen-by-leetcode-solution-gt0g/
     *
     * @param mat 给你一个由二维数组 mat 表示的 m x n 矩阵
     * @param r   矩阵的行数
     * @param c   列数
     * @return 重塑矩阵
     * 空间复杂度：O(1)
     * 时间复杂度O(rc)
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int total = m * n;
        if (total != r * c) {
            return mat;
        }

        int[][] arr = new int[r][c];
        for (int i = 0; i < total; i++) {
            arr[i / c][i % c] = mat[i / n][i % n];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] ints = new ArrayTrain566().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        for (int[] anInt : ints) {
            System.out.print(Arrays.toString(anInt));
        }
        System.out.println();

        int[][] ints1 = new ArrayTrain566().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4);
        for (int[] value : ints1) {
            System.out.print(Arrays.toString(value));
        }
        System.out.println();
    }
}
