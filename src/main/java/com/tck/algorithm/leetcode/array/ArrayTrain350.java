package com.tck.algorithm.leetcode.array;

import java.util.*;

public class ArrayTrain350 {

    /**
     * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
     * <p>
     * 两个数组的交集 II
     *
     * 题解：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/solution/liang-ge-shu-zu-de-jiao-ji-ii-by-leetcode-solution/
     * @param nums1
     * @param nums2
     * @return 它们的交集。
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(Math.min(m,n))
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            Integer count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }

    /**
     *
     * @param nums1
     * @param nums2
     * @return
     * 时间复杂度：O(mlogm+nlogn)
     *      排序时间复杂度：mlogm+nlogn
     *      遍历数组时间复杂度：m+n
     * 空间复杂度：O(Math.min(m,n))
     */
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int[] intersection = new int[Math.min(len1, len2)];
        while (index1 < len1 && index2 < len2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index++] = nums1[index1];
                index1++;
                index2++;
            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }

    public int[] intersect1(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        List<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) != 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int size = list.size();
        if (size == 0) {
            return new int[0];
        }
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        //2,2
        System.out.println(Arrays.toString(new ArrayTrain350().intersect2(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        //4,9
        System.out.println(Arrays.toString(new ArrayTrain350().intersect2(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
