package com.tck.algorithm.leetcode;

import java.util.*;

public class TestSet {

    /**
     * 两个数组的交集
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/f84ft/
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        List<Integer> list = new ArrayList<>();

        for (int i : nums2) {
            set2.add(i);
        }

        for (Integer next : set2) {
            if (set1.contains(next)) {
                list.add(next);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    /**
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/fqqcs/
     * 快乐数
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        while (n > 1 && !set.contains(n)) {
            set.add(n);
            n = eachDigitSquareSum(n);
        }
        return n == 1;
    }

    public int eachDigitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }

    /**
     * 存在重复元素
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/fkl1h/
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean add = set.add(num);
            if (!add) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        try {
            System.out.println("两个数组的交集");
            System.out.println(Arrays.toString(new TestSet().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
            System.out.println(Arrays.toString(new TestSet().intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));

            System.out.println("快乐数");
            System.out.println(new TestSet().isHappy(2));
            System.out.println(new TestSet().isHappy(19));
            System.out.println("存在重复元素");
            System.out.println(new TestSet().containsDuplicate(new int[]{1, 2, 3, 1}));
            System.out.println(new TestSet().containsDuplicate(new int[]{1, 2, 3, 4}));
            System.out.println(new TestSet().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

