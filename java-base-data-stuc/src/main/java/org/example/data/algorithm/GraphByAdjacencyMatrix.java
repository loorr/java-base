package org.example.data.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class GraphByAdjacencyMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0][1] = 1;
        arr[0][3] = 1;
        arr[0][4] = 1;
        arr[1][2] = 1;
        arr[1][3] = 1;
        arr[1][4] = 1;
        arr[2][3] = 1;
        arr[3][4] = 1;
        print(arr);

        System.out.println("=========DFS=========");
        dfs(arr, 1, new int[5][5]);
        System.out.println("\n=========BFS=========");
        bfs(arr, 1, new int[5][5]);
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void dfs(int[][] arr, int i, int[][] visited) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == 1 && visited[i][j] == 0) {
                System.out.println(i +  "->"+ j);
                visited[i][j] = 1;
                dfs(arr, j, visited);
            }
        }
    }

    public static void bfs(int[][] arr, int i, int[][] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i][i] = 1;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int j = 0; j < arr.length; j++) {
                if (arr[cur][j] == 1 && visited[cur][j] == 0) {
                    System.out.println(cur +  "->"+ j);
                    visited[cur][j] = 1;
                    queue.offer(j);
                }
            }
        }
    }
}
