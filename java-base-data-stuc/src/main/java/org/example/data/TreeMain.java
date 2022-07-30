package org.example.data;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        root.add(child1);
        root.add(child2);

        TreeNode child11 = new TreeNode(4);
        TreeNode child12 = new TreeNode(5);
        child1.add(child11);
        child1.add(child12);

        TreeNode child21 = new TreeNode(6);
        TreeNode child22 = new TreeNode(7);
        TreeNode child23 = new TreeNode(8);
        child2.add(child21);
        child2.add(child22);
        child2.add(child23);

        System.out.println(root);


    }
}
