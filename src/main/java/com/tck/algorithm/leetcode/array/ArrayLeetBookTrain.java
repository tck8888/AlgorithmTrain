package com.tck.algorithm.leetcode.array;

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 */
public class ArrayLeetBookTrain {


    /**
     * 删除排序数组中的重复项
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int i = 0;
        for (int j = 1; j < length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayLeetBookTrain().removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(new ArrayLeetBookTrain().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
