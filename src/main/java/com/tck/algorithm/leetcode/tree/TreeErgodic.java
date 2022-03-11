package com.tck.algorithm.leetcode.tree;

import com.tck.algorithm.leetcode.tree.basic.TreeCreate;
import com.tck.algorithm.leetcode.tree.basic.TreeNode;
import com.tck.algorithm.leetcode.tree.easy.LeetCode94;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的遍历
 */
public class TreeErgodic {

    /**
     * FBADCEGIH
     * ABCDEFGHI
     * ACEDBHIGF
     */

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        } else {
            List<Integer> list = new ArrayList<>();
            Integer val = root.val;

            if (val != null) {
                list.add(val);
            }
            list.addAll(preorderTraversal2(root.left));
            list.addAll(preorderTraversal2(root.right));
            return list;
        }
    }

    /**
     * https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xeywh5/
     * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
     * 前序遍历首先访问根节点，然后遍历左子树，最后遍历右子树
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        Integer val = root.val;
        if (val != null) {
            result.add(val);
        }

        preorder(root.left, result);

        preorder(root.right, result);
    }


    /**
     * 中序遍历是先遍历左子树，然后访问根节点，然后遍历右子树
     * <p>
     * https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xecaj6/
     * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);

        Integer val = root.val;
        if (val != null) {
            result.add(val);
        }

        inorder(root.right, result);
    }


    /**
     * 后序遍历是先遍历左子树，然后遍历右子树，最后访问树的根节点
     * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorder(root.left, result);

        postorder(root.right, result);

        Integer val = root.val;
        if (val != null) {
            result.add(val);
        }

    }


    /**
     * https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xej9yc/
     * 二叉树的层序遍历
     * 层序遍历就是逐层遍历树结构。
     * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //TODO:二叉树的层序遍历
        return result;
    }


    public static void main(String[] args) {
        System.out.println("144. 二叉树的前序遍历");
        System.out.println("输入:[1,null,2,3]");
        System.out.println("期待输出:[1,2,3],实际输出:" + new TreeErgodic().preorderTraversal(TreeCreate.create(1, null, 2, 3)));
        System.out.println("输入:[]");
        System.out.println("期待输出:[],实际输出:" + new TreeErgodic().preorderTraversal(TreeCreate.create()));
        System.out.println("输入:[1]");
        System.out.println("期待输出:[1],实际输出:" + new TreeErgodic().preorderTraversal(TreeCreate.create(1)));
        System.out.println("输入:[1,2]");
        System.out.println("期待输出:[1,2],实际输出:" + new TreeErgodic().preorderTraversal(TreeCreate.create(1, 2)));
        System.out.println("输入:[1,null,2]");
        System.out.println("期待输出:[1,2],实际输出:" + new TreeErgodic().preorderTraversal(TreeCreate.create(1, null, 2)));
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("94. 二叉树的中序遍历");
        System.out.println("输入:[1,null,2,3]");
        System.out.println("期待输出:[1,3,2],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create(1, null, 2, 3)));
        System.out.println("输入:[]");
        System.out.println("期待输出:[],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create()));
        System.out.println("输入:[1]");
        System.out.println("期待输出:[1],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create(1)));
        System.out.println("输入:[1,2]");
        System.out.println("期待输出:[2,1],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create(1, 2)));
        System.out.println("输入:[1,null,2]");
        System.out.println("期待输出:[1,2],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create(1, null, 2)));
        System.out.println("输入:[1,null,0,3]");
        System.out.println("期待输出:[1,3,0],实际输出:" + new TreeErgodic().inorderTraversal(TreeCreate.create(1, null, 0, 3)));
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("145. 二叉树的后序遍历");
        System.out.println("输入:[1,null,2,3]");
        System.out.println("期待输出:[3,2,1],实际输出:" + new TreeErgodic().postorderTraversal(TreeCreate.create(1, null, 2, 3)));
        System.out.println("输入:[]");
        System.out.println("期待输出:[],实际输出:" + new TreeErgodic().postorderTraversal(TreeCreate.create()));
        System.out.println("输入:[1]");
        System.out.println("期待输出:[1],实际输出:" + new TreeErgodic().postorderTraversal(TreeCreate.create(1)));

        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("                                ");
        System.out.println("102. 二叉树的层序遍历");
        System.out.println("输入:[3,9,20,null,null,15,7]");
        System.out.println("期待输出:[[3],[9,20],[15,7]],实际输出:" + new TreeErgodic().levelOrder(TreeCreate.create(3, 9, 20, null, null, 15, 7)));
        System.out.println("输入:[1]");
        System.out.println("期待输出:[[1]],实际输出:" + new TreeErgodic().levelOrder(TreeCreate.create(1)));
        System.out.println("输入:[]");
        System.out.println("期待输出:[],实际输出:" + new TreeErgodic().levelOrder(TreeCreate.create()));
    }
}
