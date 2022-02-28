package com.tck.algorithm.leetcode.array;


import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 两数之和
 */
public class Leetcode1 {

    /**
     *
     * @param nums 定一个整数数组 nums
     * @param target  和一个整数目标值 target，
     * @return 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        Leetcode1 train = new Leetcode1();

        int[] result = train.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + "," + result[1] + "]");

        result = train.twoSum2(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + "," + result[1] + "]");

        result = train.twoSum(new int[]{3, 2, 3}, 6);
        System.out.println("[" + result[0] + "," + result[1] + "]");

        result = train.twoSum2(new int[]{3, 2, 3}, 6);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
