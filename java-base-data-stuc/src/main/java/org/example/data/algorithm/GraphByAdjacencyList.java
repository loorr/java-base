package org.example.data.algorithm;

import org.example.data.common.GraphNode;

import java.util.*;

public class GraphByAdjacencyList {
    public static void main(String[] args) {
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        node0.neighbors.add(node1);
        node0.neighbors.add(node3);
        node0.neighbors.add(node4);

        node1.neighbors.add(node3);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node3);
        node3.neighbors.add(node4);

        // 存储图的邻接表
        List<GraphNode> graphNodeList = new ArrayList<>();
        graphNodeList.add(node0);
        graphNodeList.add(node1);
        graphNodeList.add(node2);
        graphNodeList.add(node3);
        graphNodeList.add(node4);

        System.out.println("DFS: ");
        dfs(graphNodeList, node1, new HashSet<>());

        System.out.println("\nBFS: ");
        bfs(graphNodeList, node1);
    }


    public static void dfs(List<GraphNode> graphNodeList, GraphNode start, Set<GraphNode> visited) {
        if (start == null) {
            return;
        }
        System.out.print(start.val + " ");
        visited.add(start);
        for (GraphNode neighbor : start.neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(graphNodeList, neighbor, visited);
            }
        }
    }

    public static void bfs(List<GraphNode> graphNodeList, GraphNode start) {
        if (graphNodeList == null || graphNodeList.isEmpty()) {
            return;
        }
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(start);
        Set<GraphNode> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            GraphNode node = queue.poll();
            if (visited.contains(node)) {
                continue;
            }
            System.out.print(node.val + " ");
            visited.add(node);
            for (GraphNode neighbor : node.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }
    }
}
