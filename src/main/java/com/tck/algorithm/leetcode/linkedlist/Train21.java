package com.tck.algorithm.leetcode.linkedlist;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * <p>
 * 合并两个有序链表
 */
public class Train21 {

    /**
     * 题解 https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/yi-kan-jiu-hui-yi-xie-jiu-fei-xiang-jie-di-gui-by-/
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        System.out.println(MyLinkedList.getLinkedListValue(new Train21().mergeTwoLists(MyLinkedList.createLinkedList(new int[]{1, 2, 4}), MyLinkedList.createLinkedList(new int[]{1, 3, 4}))));
        System.out.println(MyLinkedList.getLinkedListValue(new Train21().mergeTwoLists(MyLinkedList.createLinkedList(new int[]{}), MyLinkedList.createLinkedList(new int[]{}))));
        System.out.println(MyLinkedList.getLinkedListValue(new Train21().mergeTwoLists(MyLinkedList.createLinkedList(new int[]{}), MyLinkedList.createLinkedList(new int[]{0}))));
    }
}
