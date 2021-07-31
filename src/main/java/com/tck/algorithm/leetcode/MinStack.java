package com.tck.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author tck88
 * @date 2020/4/16
 */
public class MinStack {

    //请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
    //


    public Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {

        if (stack.size() == 0) {
            min = x;
            stack.push(x);
        } else {
            Integer peek = stack.peek();
            if (peek < x) {
                stack.pop();
                stack.push(x);
                stack.push(peek);
            }else {
                stack.push(x);
            }
        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();

        System.out.println(minStack.getMin());  // --> 返回 -2.

    }
}
