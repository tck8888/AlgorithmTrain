package com.tck.algorithm.leetcode.tencent;


/**
 * https://leetcode-cn.com/problems/reverse-string/
 * 344. 反转字符串
 */
public class LeetCode344 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        new LeetCode344().reverseString(chars);
        System.out.println(chars);

        char[] chars2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        new LeetCode344().reverseString(chars2);
        System.out.println(chars2);
    }
}
