package com.tck.algorithm.leetcode.offer.easy;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * <p>
 * 剑指 Offer 05. 替换空格
 */
public class ReplaceSpace {

    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++]=c;
            }
        }
        return new String(array,0,size);
    }

    public String replaceSpace2(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceSpace().replaceSpace("We are happy."));
    }
}
