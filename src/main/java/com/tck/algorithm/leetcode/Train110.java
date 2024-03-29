package com.tck.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class Train110 {

    //给定一个二叉树，判断它是否是高度平衡的二叉树。

    public static void main(String[] args) {

    }

    public  boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }else {
            return Math.abs(height(root.left)-height(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
        }

    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
