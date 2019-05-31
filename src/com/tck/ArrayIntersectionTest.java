package com.tck;


import java.util.*;

/**
 * description:两个数组的交集</br>
 * created on: 2019/5/31 10:12</br>
 *
 * @author tck
 * @version 1.0
 */
public class ArrayIntersectionTest {


    public static int[] arrayIntersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        if (nums1.length > nums2.length) {
            for (int item : nums1) {
                for (int value : nums2) {
                    if (item == value) {
                        set.add(item);
                    }
                }
            }
        } else {
            for (int item : nums2) {
                for (int value : nums1) {
                    if (item == value) {
                        set.add(item);
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        int[] temp = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            temp[i] = list.get(i);
        }
        return temp;
    }

    public static int[] arrayIntersection2(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        Set<Integer> set1 = new HashSet<>(nums1.length);
        Set<Integer> set2 = new HashSet<>();

        for (int item : nums1) {
            set1.add(item);
        }

        for (int item : nums2) {
            if (set1.contains(item)) {
                set2.add(item);
            }
        }

        int[] temp = new int[set2.size()];
        int i = 0;
        for (Integer integer : set2) {
            temp[i++] = integer;
        }

        return temp;
    }


    public static void main(String[] args) {
        // write your code here
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(ArrayIntersectionTest.arrayIntersection2(nums1, nums2)));
        int[] nums11 = {4, 9, 5};
        int[] nums22 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(ArrayIntersectionTest.arrayIntersection2(nums11, nums22)));

    }
}
