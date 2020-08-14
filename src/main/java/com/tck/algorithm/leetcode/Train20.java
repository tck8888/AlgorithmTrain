package com.tck.algorithm.leetcode;

import java.util.*;

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

    public static boolean isValid(String s) {
        int n = s.length();

        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        try {
            System.out.println(isValid(""));
            System.out.println(isValid("()"));
            System.out.println(isValid("()[]{}"));
            System.out.println(isValid("(]"));
            System.out.println(isValid("([)]"));
            System.out.println(isValid("{[]}"));
           /* false
            true
            true
            false
            false
            true*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
