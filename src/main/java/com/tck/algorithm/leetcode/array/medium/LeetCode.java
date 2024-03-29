package com.tck.algorithm.leetcode.array.medium;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/zero-matrix-lcci/
 * 零矩阵
 */
public class LeetCode {

    public void setZeroes(int[][] matrix) {
        List<int[]> map = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    map.add(new int[]{i, j});
                }
            }
        }

        for (int[] ints : map) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[ints[0]][j] = 0;
                    matrix[i][ints[1]] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes3(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean flagCol0 = false, flagRow0 = false;
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                flagCol0 = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                flagRow0 = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (flagCol0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (flagRow0){
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("面试题 01.08. 零矩阵");
        System.out.println("输入:[[1, 1, 1],[1, 0, 1],[1, 1, 1]]");
        int[][] ints = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        new LeetCode().setZeroes3(ints);
        System.out.println("期待输出:[[1,0,1],[0,0,0],[1,0,1]],实际输出:" + Arrays.deepToString(ints));
        System.out.println("输入:[[0,1,2,0],[3,4,5,2],[1,3,1,5]]");
        int[][] ints2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new LeetCode().setZeroes3(ints2);
        System.out.println("期待输出:[[0,0,0,0],[0,4,5,0],[0,3,1,0]],实际输出:" + Arrays.deepToString(ints2));
    }
}
