package com.tck.algorithm.leetcode.offer.easy;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 剑指 Offer 03. 数组中重复的数字
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
      Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int j;
        for (int i = 0; i < length; i++) {
            j = i + 1;
            if (j < length) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(new FindRepeatNumber().findRepeatNumber(new int[]{3, 1, 2, 3}));
    }
}
