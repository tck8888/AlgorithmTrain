package com.tck.algorithm.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 请判断一个链表是否为回文链表。
 */
public class Train234 {

    public boolean isPalindrome(ListNode head) {
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

        int start = 0;

        int end = size - 1;

        while (start < end) {
            if (!values.get(start).equals(values.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Train234().isPalindrome(MyLinkedList.createLinkedList(new int[]{1, 2})));
        System.out.println(new Train234().isPalindrome(MyLinkedList.createLinkedList(new int[]{1, 2, 2, 1})));
    }


}
