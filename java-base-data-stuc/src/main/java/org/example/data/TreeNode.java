package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public List<TreeNode> nodes;

    public TreeNode(){
    }

    public TreeNode(int val){
        this.val = val;
    }

    public void add(TreeNode node){
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }

}
