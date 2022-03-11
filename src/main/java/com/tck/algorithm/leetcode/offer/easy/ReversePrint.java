package com.tck.algorithm.leetcode.offer.easy;

import com.tck.algorithm.leetcode.linkedlist.ListNode;
import com.tck.algorithm.leetcode.linkedlist.MyLinkedList;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/submissions/
 * 剑指 Offer 06. 从尾到头打印链表
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> objects = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            objects.push(temp);
            temp = temp.next;
        }
        int size = objects.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = objects.pop().val;
        }
        return arr;
    }

    public int[] reversePrint2(ListNode head) {
        List<Integer> objects = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            objects.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(objects);
        return objects.stream().mapToInt(Integer::valueOf).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReversePrint().reversePrint(MyLinkedList.createLinkedList(new int[]{1, 3, 2}))));
    }
}
