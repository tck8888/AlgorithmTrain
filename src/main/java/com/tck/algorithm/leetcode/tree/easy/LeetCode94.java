package com.tck.algorithm.leetcode.tree.easy;


import com.tck.algorithm.leetcode.tree.basic.TreeCreate;
import com.tck.algorithm.leetcode.tree.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * <p>
 * 中序遍历是先遍历左子树，然后访问根节点，然后遍历右子树。
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        } else {
            List<Integer> list = inorderTraversal(root.left);
            Integer val = root.val;
            if (val != null) {
                list.add(val);
            }
            list.addAll(inorderTraversal(root.right));
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println("输入:[1,null,2,3]");
        System.out.println("期待输出:[1,3,2],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create(1, null, 2, 3)));
        System.out.println("输入:[]");
        System.out.println("期待输出:[],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create()));
        System.out.println("输入:[1]");
        System.out.println("期待输出:[1],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create(1)));
        System.out.println("输入:[1,2]");
        System.out.println("期待输出:[2,1],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create(1, 2)));
        System.out.println("输入:[1,null,2]");
        System.out.println("期待输出:[1,2],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create(1, null, 2)));
        System.out.println("输入:[1,null,0,3]");
        System.out.println("期待输出:[1,3,0],实际输出:" + new LeetCode94().inorderTraversal(TreeCreate.create(1, null, 0, 3)));
    }
}
