package com.tck.algorithm.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tck88
 * @date 2021/7/31
 */
public class LinkedListInterviewQuestions {

    /**
     * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
     * 面试题 02.01. 移除重复节点
     * @tag easy
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> keys = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            int val = currentNode.val;
            if (keys.contains(val)) {
                //TODO:
            } else {
                keys.add(val);
            }
            currentNode = currentNode.next;
        }
        return null;
    }
}
