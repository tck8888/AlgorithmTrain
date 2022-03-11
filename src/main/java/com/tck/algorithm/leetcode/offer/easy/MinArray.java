package com.tck.algorithm.leetcode.offer.easy;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class MinArray {


    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }


    public int minArray1(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }

        return numbers[0];
    }

    public static void main(String[] args) {
        System.out.println(new MinArray().minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(new MinArray().minArray(new int[]{2, 2, 2, 0, 1}));
    }
}
