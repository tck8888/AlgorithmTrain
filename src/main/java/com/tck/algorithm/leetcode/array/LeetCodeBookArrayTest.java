package com.tck.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/leetbook/read/array-and-string/yf47s/
 */
public class LeetCodeBookArrayTest {

    /**
     * https://leetcode-cn.com/problems/find-the-middle-index-in-array/
     * 找到数组的中间位置
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    /**
     * https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
     * 搜索插入位置
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
            System.out.println("mid:" + mid + ",left:" + left + ",right=" + right);
        }
        return left;
    }


    /**
     * https://leetcode-cn.com/leetbook/read/array-and-string/c5tv3/
     * 合并区间
     *
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int[] term = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (term[1] >= intervals[i][0]) {
                term[1] = Math.max(term[1], intervals[i][1]);
            } else {
                list.add(term);
                term = intervals[i];
            }
        }
        list.add(term);

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        System.out.println("找到数组的中间位置");
        System.out.println(new LeetCodeBookArrayTest().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(new LeetCodeBookArrayTest().pivotIndex(new int[]{2, 1, -1}));
        System.out.println(new LeetCodeBookArrayTest().pivotIndex(new int[]{1, 2, 3}));

        System.out.println("搜索插入位置");
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1, 3, 5, 6}, 0));
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1}, 0));
        System.out.println(new LeetCodeBookArrayTest().searchInsert(new int[]{1, 2, 3, 4, 5}, 2));

        System.out.println("合并区间");
        System.out.println(Arrays.deepToString(new LeetCodeBookArrayTest().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(Arrays.deepToString(new LeetCodeBookArrayTest().merge(new int[][]{{1, 4}, {4, 5}})));
    }
}
