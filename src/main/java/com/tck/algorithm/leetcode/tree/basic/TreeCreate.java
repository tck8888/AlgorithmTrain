package com.tck.algorithm.leetcode.tree.basic;


/**
 * 创建二叉树
 */
public class TreeCreate {

    public Integer[] values;
    private int index = 0;

    public TreeCreate(Integer[] values) {
        this.values = values;
    }

    public static TreeNode create(Integer... values) {
        return new TreeCreate(values).createTree(new TreeNode(), 0);
    }

    public TreeNode createTree(TreeNode node, int i) {
        if (index >= values.length) {
            return null;
        }
        if (values[i] == null) {
            return null;
        } else {
            node.val = values[i];
        }

        TreeNode leftChild = new TreeNode();
        node.left = createTree(leftChild, ++index);

        TreeNode rightChild = new TreeNode();
        node.right = createTree(rightChild, ++index);

        return node;
    }

    public static void main(String[] args) {
        System.out.println(TreeCreate.create(1, null, 0, 3));
    }
}
