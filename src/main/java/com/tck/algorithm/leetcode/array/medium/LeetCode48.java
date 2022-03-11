package com.tck.algorithm.leetcode.array.medium;

import java.util.Arrays;

/**
 * 48. 旋转图像
 * https://leetcode-cn.com/problems/rotate-image/
 *
 * https://leetcode-cn.com/leetbook/read/array-and-string/clpgd/
 */
public class LeetCode48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.arraycopy(matrix_new[i], 0, matrix[i], 0, n);
        }
    }

    public void rotate2(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("48. 旋转图像");
        System.out.println("输入:[[1, 2, 3],[4, 5, 6],[7, 8, 9]]");
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new LeetCode48().rotate2(ints);
        System.out.println("期待输出:[[7, 4 ,1],[8, 5, 2],[9, 6 ,3]],实际输出:" + Arrays.deepToString(ints));
        System.out.println("输入:[[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]");
        int[][] ints2 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        new LeetCode48().rotate2(ints2);
        System.out.println("期待输出:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]],实际输出:" + Arrays.deepToString(ints2));
    }
}
