package com.tck.algorithm.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/most-common-word/
 */
public class LeetCode819 {

    /**
     * 最常见的单词
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0 || banned == null) {
            return "";
        }
        String[] s = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s");

        Map<String, Integer> map = new HashMap<>();

        for (String value : s) {
            if (value.isEmpty()) {
                continue;
            }
            Integer orDefault = map.getOrDefault(value, 0);
            if (orDefault == 0) {
                map.put(value, 1);
            } else {
                orDefault++;
                map.put(value, orDefault);
            }
        }

        for (String value : banned) {
            map.remove(value);
        }

        String temp = "";
        int value = 0;

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (value < stringIntegerEntry.getValue()) {
                temp = stringIntegerEntry.getKey();
                value = stringIntegerEntry.getValue();
            }
        }

        return temp;
    }

    public String mostCommonWord2(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0 || banned == null) {
            return "";
        }

        paragraph += ".";
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String temp = "";
        int ansfreq = 0;
        StringBuilder word = new StringBuilder();

        char[] chars = paragraph.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                word.append(Character.toLowerCase(aChar));
            } else if (word.length() > 0) {
                String s = word.toString();
                if (!bannedSet.contains(s)) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                    if (map.get(s) > ansfreq) {
                        temp = s;
                        ansfreq = map.get(s);
                    }
                }
                word.setLength(0);
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        System.out.println("最常见的单词");
        System.out.println(new LeetCode819().mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(new LeetCode819().mostCommonWord("a.", new String[]{}));
        System.out.println(new LeetCode819().mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));

        System.out.println("最常见的单词方法二");
        System.out.println(new LeetCode819().mostCommonWord2("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(new LeetCode819().mostCommonWord2("a.", new String[]{}));
        System.out.println(new LeetCode819().mostCommonWord2("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }
}
