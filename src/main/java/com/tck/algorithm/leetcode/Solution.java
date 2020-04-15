package com.tck.algorithm.leetcode;

/**
 * @author tck88
 * @date 2020/4/15
 */
public class Solution {

    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUnique2(String astr) {
        int bit = 0;
        char[] chars = astr.toCharArray();
        for (char c : chars) {
            int index = c - 'a';
            int newBit = 1 << index;
            System.out.println("newBit:"+Integer.toBinaryString(newBit)+" bit:"+Integer.toBinaryString(bit));
            if ((bit & newBit) == newBit) {
                System.out.println("bit & newBit:"+Integer.toBinaryString(bit & newBit));
                return false;
            }
            bit |= newBit;

        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abcdefghijklmnopqrstuvwxyza";
        System.out.println(solution.isUnique2(s1));
//        String s2 = "abc";
//        System.out.println(solution.isUnique2(s2));
    }
}
