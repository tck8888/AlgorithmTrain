package com.tck.algorithm.leetcode.linkedlist.easy;


import com.tck.algorithm.leetcode.linkedlist.ListNode;
import com.tck.algorithm.leetcode.linkedlist.MyLinkedList;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * <p>
 * 你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * {@link com.tck.algorithm.leetcode.linkedlist.medium.Train92}
 */
public class Train206 {

    /**
     * https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-a7rx/
     * 动画演示
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println(MyLinkedList.getLinkedListValue(new Train206().reverseList(MyLinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}))));
        System.out.println(MyLinkedList.getLinkedListValue(new Train206().reverseList(MyLinkedList.createLinkedList(new int[]{1, 2}))));
        System.out.println(MyLinkedList.getLinkedListValue(new Train206().reverseList(MyLinkedList.createLinkedList(new int[]{}))));
    }
}
