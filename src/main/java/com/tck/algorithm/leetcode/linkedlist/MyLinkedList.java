package com.tck.algorithm.leetcode.linkedlist;

public class MyLinkedList {

    /**
     * 创建链表
     *
     * @param arr 数组
     * @return 链表
     */
    public static ListNode createLinkedList(int[] arr) {
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
}
