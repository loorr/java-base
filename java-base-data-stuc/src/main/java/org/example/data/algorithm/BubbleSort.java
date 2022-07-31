package org.example.data.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 17, 14, 5, 6, 17, 8, 9, 10};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 每次都可以把最大的数移到末尾
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
