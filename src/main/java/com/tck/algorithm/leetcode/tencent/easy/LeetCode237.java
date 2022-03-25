package com.tck.algorithm.leetcode.tencent.easy;

import com.tck.algorithm.leetcode.linkedlist.ListNode;
import com.tck.algorithm.leetcode.linkedlist.MyLinkedList;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 237. 删除链表中的节点
 */
public class LeetCode237 {
    private ListNode head;

    public LeetCode237(ListNode head) {
        this.head = head;
    }

    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            ListNode pre = current;
            if (current.next.val == node.val) {
                pre.next = current.next;
                   break;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        ListNode linkedList = MyLinkedList.createLinkedList2(4, 5, 1, 9);
        new LeetCode237(linkedList).deleteNode(new ListNode(5));
    }
}
