package com.tck.algorithm.leetcode.array;

/**
 * @author tck88
 * @date 2021/7/31
 */
public class ArrayTrain53 {


    /**
     * https://leetcode-cn.com/problems/maximum-subarray/
     * <p>
     * 题解 https://leetcode-cn.com/problems/maximum-subarray/solution/hua-jie-suan-fa-53-zui-da-zi-xu-he-by-guanpengchn/
     *
     * @param nums 给定一个整数数组 nums
     * @return 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
     */
    public int maxSubArray(int[] nums) {
        int sum = 0, maxAns = nums[0];
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            maxAns = Math.max(maxAns, sum);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        //6
        System.out.println(new ArrayTrain53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        //1
        System.out.println(new ArrayTrain53().maxSubArray(new int[]{1}));
        //0
        System.out.println(new ArrayTrain53().maxSubArray(new int[]{0}));
        //-1
        System.out.println(new ArrayTrain53().maxSubArray(new int[]{-1}));
        //-100000
        System.out.println(new ArrayTrain53().maxSubArray(new int[]{-100000}));
    }


}
