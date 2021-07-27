package com.tck.algorithm.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 请判断一个链表是否为回文链表。
 */
public class Train234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        List<Integer> values = new ArrayList<>();

        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int size = values.size();

        if (size == 0) {
            return false;
        }

        int front = 0;

        int back = size - 1;

        while (front < back) {
            if (!values.get(front).equals(values.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Train234().isPalindrome(MyLinkedList.createLinkedList(new int[]{1, 2})));
        System.out.println(new Train234().isPalindrome(MyLinkedList.createLinkedList(new int[]{1, 2, 2, 1})));
    }


}
