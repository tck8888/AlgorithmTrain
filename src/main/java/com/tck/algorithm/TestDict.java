package com.tck.algorithm;

import com.tck.algorithm.leetcode.Solution;

import java.util.*;

public class TestDict {

    /**
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/f4o67/
     * 有效的字母异位词
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Map<String, Integer> map1 = new HashMap<>();
        for (char c : chars1) {
            String s1 = String.valueOf(c);
            map1.put(s1, map1.getOrDefault(s1, 0) + 1);
        }

        for (char c : chars2) {
            String s1 = String.valueOf(c);
            if (map1.containsKey(s1)) {
                map1.put(s1, map1.get(s1) - 1);
            } else {
                return false;
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
            if (stringIntegerEntry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        return String.valueOf(chars1).equals(String.valueOf(chars2));
    }

    /**
     * p 112 a 97
     * <p>
     * t 116 i 105
     * <p>
     * 1 49
     * 2 50
     * <p>
     * 161
     * 116+50
     * <p>
     * <p>
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/f1f86/
     * 同构字符串
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.indexOf(ch1[i]) != t.indexOf(ch2[i])) return false;
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

    /**
     * https://leetcode-cn.com/leetbook/read/all-about-lockup-table/fc4ic/
     * 据字符出现频率排序
     *
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        StringBuilder stringBuffer = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            int value = entry.getValue();
            stringBuffer.append(String.valueOf(entry.getKey()).repeat(Math.max(0, value)));
        }

        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        System.out.println("有效的字母异位词 方法一");
        long start = System.currentTimeMillis();
        System.out.println("期待值:true，实际值:" + new TestDict().isAnagram("anagram", "nagaram"));
        System.out.println("期待值:false，实际值:" + new TestDict().isAnagram("rat", "car"));
        //System.out.println("期待值:true，实际值:" + new TestDict().isAnagram("你好llll", "好你yyy"));
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        System.out.println("有效的字母异位词 方法二");
        start = System.currentTimeMillis();
        System.out.println("期待值:true，实际值:" + new TestDict().isAnagram2("anagram", "nagaram"));
        System.out.println("期待值:false，实际值:" + new TestDict().isAnagram2("rat", "car"));
        System.out.println("期待值:true，实际值:" + new TestDict().isAnagram2("你好yyy", "好你"));
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        System.out.println("同构字符串 方法一");
        start = System.currentTimeMillis();
        System.out.println("期待值:true，实际值:" + new TestDict().isIsomorphic("egg", "add"));
        System.out.println("期待值:false，实际值:" + new TestDict().isIsomorphic("foo", "bar"));
        System.out.println("期待值:true，实际值:" + new TestDict().isIsomorphic("paper", "title"));
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        System.out.println("同构字符串 方法二");
        start = System.currentTimeMillis();
        System.out.println("期待值:true，实际值:" + new TestDict().isIsomorphic2("egg", "add"));
        System.out.println("期待值:false，实际值:" + new TestDict().isIsomorphic2("foo", "bar"));
        System.out.println("期待值:true，实际值:" + new TestDict().isIsomorphic2("paper", "title"));
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        System.out.println("据字符出现频率排序 方法一");
        start = System.currentTimeMillis();
        System.out.println("期待值:eert 或者 eetr，实际值:" + new TestDict().frequencySort("tree"));
        System.out.println("期待值:cccaaa 或者 aaaccc，实际值:" + new TestDict().frequencySort("cccaaa"));
        System.out.println("期待值:bbAa 或者 bbaA，实际值:" + new TestDict().frequencySort("Aabb"));
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

    }
}
