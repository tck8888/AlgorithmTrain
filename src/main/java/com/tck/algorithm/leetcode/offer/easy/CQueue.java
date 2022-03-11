package com.tck.algorithm.leetcode.offer.easy;


import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class CQueue {

    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }

    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.print("null, ");
        System.out.print(cQueue.deleteHead()+", ");
        cQueue.appendTail(5);
        System.out.print("null, ");
        cQueue.appendTail(2);
        System.out.print("null, ");
        System.out.print(cQueue.deleteHead()+", ");
        System.out.print(cQueue.deleteHead()+"");
    }
}
