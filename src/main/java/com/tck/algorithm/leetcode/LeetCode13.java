package com.tck.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 13.  罗马数字转整数
 */
public class LeetCode13 {

   private final Map<Character, Integer> map = new HashMap<>();

    public LeetCode13() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }


    public int romanToInt(String strs) {
        char[] chars = strs.toCharArray();
        int index = 0;
        int sum = 0;
        while (index < chars.length) {
            char aChar = chars[index];
            if (index + 1 < chars.length) {
                if (aChar == 'I' && chars[index + 1] == 'V') {
                    sum += 4;
                    index += 2;
                } else if (aChar == 'I' && chars[index + 1] == 'X') {
                    sum += 9;
                    index += 2;
                } else if (aChar == 'X' && chars[index + 1] == 'L') {
                    sum += 40;
                    index += 2;
                } else if (aChar == 'X' && chars[index + 1] == 'C') {
                    sum += 90;
                    index += 2;
                } else if (aChar == 'C' && chars[index + 1] == 'D') {
                    sum += 400;
                    index += 2;
                } else if (aChar == 'C' && chars[index + 1] == 'M') {
                    sum += 900;
                    index += 2;
                } else {
                    sum += map.getOrDefault(aChar, 0);
                    index++;
                }
            } else {
                sum += map.getOrDefault(aChar, 0);
                index++;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        // 3
        //  System.out.println(new LeetCode13().romanToInt("III"));
        // 4
        //  System.out.println(new LeetCode13().romanToInt("IV"));
        // 1994
        //  System.out.println(new LeetCode13().romanToInt("MCMXCIV"));
        // 1476
        System.out.println(new LeetCode13().romanToInt("MCDLXXVI"));
    }
}
