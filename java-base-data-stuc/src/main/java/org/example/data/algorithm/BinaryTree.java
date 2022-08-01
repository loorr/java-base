package org.example.data.algorithm;

import org.example.data.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        BinaryTreeNode node8 = new BinaryTreeNode(8);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node7;
        node5.right = node8;
        node3.right = node6;

        BinaryTree tree = new BinaryTree();
        System.out.println("前序遍历：");
        tree.preOrderTraverse1(root);

        System.out.println("\n前序遍历：");
        tree.preOrderTraverse2(root);

        System.out.println("\n中序遍历：");
        tree.inOrderTraverse1(root);

        System.out.println("\n后序遍历：");
        tree.postOrderTraverse1(root);

        System.out.println("\n层序遍历：");
        tree.levelTraverse(root);
    }

    // 根结点 ---> 左子树 ---> 右子树
    public void preOrderTraverse1(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.val+"  ");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }

    // 根结点 ---> 左子树 ---> 右子树
    public void preOrderTraverse2(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();

        BinaryTreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                // 先访问了 根节点
                System.out.print(pNode.val+"  ");
                stack.push(pNode);
                pNode = pNode.left;
            } else {                                //pNode == null && !stack.isEmpty()
                BinaryTreeNode node = stack.pop();
                pNode = node.right;
            }
        }
    }

    // 左子树 ---> 根结点 ---> 右子树
    public void inOrderTraverse1(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraverse1(root.left);
            System.out.print(root.val+"  ");
            inOrderTraverse1(root.right);
        }
    }

    // 左子树 ---> 右子树 ---> 根结点
    public void postOrderTraverse1(BinaryTreeNode root) {
        if (root != null) {
            postOrderTraverse1(root.left);
            postOrderTraverse1(root.right);
            System.out.print(root.val+"  ");
        }
    }

    // 层序遍历
    public void levelTraverse(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.print(node.val+"  ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
