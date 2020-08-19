package com.tck.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 */
public class Train647 {

    //给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
    //
    //具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串

    public static void main(String[] args) {
        System.out.println(new Train647().countSubstrings("abc"));
     //   System.out.println(new Train647().countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }

}
