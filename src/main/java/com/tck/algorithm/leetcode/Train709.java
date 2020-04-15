package com.tck.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author tck88
 * @date 2020/4/15
 */
public class Train709 {

//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String toLowerCase1(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z') {
                stringBuilder.append((char) (aChar|32));
            }else {
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Train709().toLowerCase1("Hello"));
        System.out.println(new Train709().toLowerCase1("here"));
        System.out.println(new Train709().toLowerCase1("LOVELY"));
        System.out.println(new Train709().toLowerCase1("PiTAs"));

        int a = 'a';//1000001
        int b = 'A';//1000001
        int c = 32;// 0100000

        System.out.println(Integer.toBinaryString(a)+" "+Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}
