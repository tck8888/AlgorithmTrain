package com.tck.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * @author tck88
 * @date 2021/8/1
 */
public class ArrayTrain88 {

    /**
     * https://leetcode-cn.com/problems/merge-sorted-array/
     * <p>
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * <p>
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素
     *
     * @param nums1 有序整数数组
     * @param m
     * @param nums2 有序整数数组
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        new ArrayTrain88().merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

        int[] nums11 = {1};
        int[] nums21 = {};

        new ArrayTrain88().merge(nums1,1,nums21,0);
        System.out.println(Arrays.toString(nums11));
    }
}
