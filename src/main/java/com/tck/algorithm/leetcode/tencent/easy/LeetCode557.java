package com.tck.algorithm.leetcode.tencent.easy;


/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * 557. 反转字符串中的单词 III
 */
public class LeetCode557 {

    public String reverseWords(String s) {
        int i = 0;
        int len = s.length();
        StringBuilder result = new StringBuilder();
        while (i < len) {
            int start = i;
            while (i < len && s.charAt(i) != ' ') {
                i++;
            }
            //找到一个空格了
            for (int p = start; p < i; p++) {
                result.append(s.charAt(start + i - p - 1));
            }

            //找下一个空格
            while (i < len && s.charAt(i) == ' ') {
                i++;
                result.append(' ');
            }
        }
        return result.toString();
    }

    public String reverseWords1(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : split) {
            char[] chars = word.toCharArray();
            char temp;
            for (int left = 0, right = word.length() - 1; left < right; left++, right--) {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }
            result.append(new String(chars)).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode557().reverseWords("Let's take LeetCode contest"));
        System.out.println(new LeetCode557().reverseWords("God Ding"));
    }
}
