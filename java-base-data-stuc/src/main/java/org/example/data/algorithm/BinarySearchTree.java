package org.example.data.algorithm;

import org.example.data.BinaryTreeNode;


public class BinarySearchTree {
    public static void main(String[] args) {
        int[] arr = new int[]{9,6,2, 2,7,2,6, 4,8,1};
        BinaryTreeNode root = new BinaryTreeNode(5);
        for (int i = 0; i < 10; i++) {
            insert(root, arr[i]);
        }
        BinaryTree tree = new BinaryTree();
        System.out.println("前序遍历：");
        tree.preOrderTraverse1(root);
    }

    // 判断是否是二叉搜索树
    public static BinaryTreeNode insert(BinaryTreeNode root, int value) {
        if (root == null) {
            return new BinaryTreeNode(value);
        }
        if (value < root.val) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // 查找value是否在树中
    public static int search(BinaryTreeNode root, int value) {
        if (root == null) {
            return -1;
        }
        if (root.val == value) {
            return value;
        }
        if (value < root.val) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }
}
