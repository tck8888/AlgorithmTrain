package com.tck.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * 11. 盛最多水的容器
 */
public class Train11 {


    public int maxArea(int[] height) {
        int maxArea = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                maxArea=Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr1 = {1, 1};
        int[] arr2 = {4, 3, 2, 1, 4};
        int[] arr3 = {1, 2, 1};
        System.out.println(new Train11().maxArea(arr));
        System.out.println(new Train11().maxArea(arr1));
        System.out.println(new Train11().maxArea(arr2));
        System.out.println(new Train11().maxArea(arr3));

    }
}
