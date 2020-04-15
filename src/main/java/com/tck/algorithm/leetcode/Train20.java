package com.tck.algorithm.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author tck88
 * https://leetcode-cn.com/problems/valid-parentheses/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
 * @date 2020/3/11
 */
public class Train20 {

    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

    //有效字符串需满足：

    //左括号必须用相同类型的右括号闭合。
    //左括号必须以正确的顺序闭合。
    //注意空字符串可被认为是有效字符串。
    // 输入: "{[]}"   }][{
    //输出: true

    private HashMap<Character, Character> map;

    public Train20() {
        map = new HashMap<>();

        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');

    }

    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (characters.size() == 0) {
                characters.push(aChar);
            } else {
                Character peek = characters.peek();
                if (map.get(peek) == aChar) {
                    characters.pop();
                } else {
                    characters.push(aChar);
                }
            }
        }

        return characters.size() == 0;
    }

    public static void main(String[] args) {

    }
}
