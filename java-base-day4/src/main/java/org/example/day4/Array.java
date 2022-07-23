package org.example.day4;

/**
 * 二维数组
 */
public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        // [
        // [0, 1, 2, 3],
        // [0, 1, 2, 3],
        // [0, 1, 2, 3]
        // ]

        arr[1][1] = 1;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * j;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // [
        // [0],
        // [0, 1],
        // [0, 1, 2]
        // ]
        int[][] arr2 = new int[3][];
        for (int i = 0; i < arr2.length; i++) {
           arr2[i] = new int[i + 1];
        }
    }
}
