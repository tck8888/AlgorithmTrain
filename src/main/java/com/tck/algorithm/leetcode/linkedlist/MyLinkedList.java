package com.tck.algorithm.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {

    public static ListNode createLinkedList2(int... arr) {
        return getListNode(arr);
    }

    private static ListNode getListNode(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        head.next = null;
        if (len == 1) {
            return head;
        }
        ListNode pre = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode listNode = new ListNode(arr[i]);
            pre.next = listNode;
            pre = listNode;
        }
        return head;
    }

    /**
     * 创建链表
     *
     * @param arr 数组
     * @return 链表
     */
    public static ListNode createLinkedList(int[] arr) {
        return getListNode(arr);

    }


    public static List<Integer> getLinkedListValue(ListNode listNode) {
        List<Integer> values = new ArrayList<>();

        if (listNode == null) {
            return values;
        }
        ListNode head = listNode;
        values.add(head.val);

        while (head.next != null) {
            head = head.next;
            values.add(head.val);
        }

        return values;
    }
}
