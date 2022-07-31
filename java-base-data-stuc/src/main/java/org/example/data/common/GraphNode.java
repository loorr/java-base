package org.example.data.common;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode(int val) {
        neighbors = new ArrayList<>();
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GraphNode)) {
            return false;
        }
        GraphNode graphNode = (GraphNode) o;
        return val == graphNode.val && neighbors.equals(graphNode.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, neighbors);
    }
}
