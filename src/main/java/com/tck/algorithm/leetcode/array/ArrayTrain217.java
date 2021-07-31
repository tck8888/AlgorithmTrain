package com.tck.algorithm.leetcode.array;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/
 *
 * @author tck88
 * @date 2021/7/31
 */
public class ArrayTrain217 {


    /**
     * 存在重复元素
     * https://leetcode-cn.com/problems/contains-duplicate/
     *
     * @param nums 给定一个整数数组
     * @return 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
     * <p>
     * 时间复杂度:O(NlogN)
     * 空间复杂度:O(logN)
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param nums
     * @return 时间复杂度:O(N)
     * 空间复杂度:O(N)
     */
    public boolean containsDuplicate2(int[] nums) {
        int len = nums.length;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return set.size() != len;
    }

    public boolean containsDuplicate1(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayTrain217().containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(new ArrayTrain217().containsDuplicate(new int[]{0, 4, 5, 0, 3, 6}));
        System.out.println(new ArrayTrain217().containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(new ArrayTrain217().containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(new ArrayTrain217().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
