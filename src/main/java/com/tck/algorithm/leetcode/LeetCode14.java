package com.tck.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * 14. 最长公共前缀
 */
public class LeetCode14 {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int length = strs.length;
        for (int i = 1; i < length; i++) {
            int minLength = Math.min(prefix.length(), strs[i].length());
            int index = 0;
            while (index < minLength && prefix.charAt(index) == strs[i].charAt(index)) {
                index++;
            }
            prefix = prefix.substring(0, index);
            if (prefix.length()==0){
                break;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        // fl
        System.out.println(new LeetCode14().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        // ""
        System.out.println(new LeetCode14().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(new LeetCode14().longestCommonPrefix(new String[]{"dog"}));
    }
}
