package org.example.data.algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 17, 14, 5, 6, 17, 8, 9, 10};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 快速排序
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int j = left;
        int k = right;
        int pivot = arr[(left + right) / 2];
        while (j <= k) {
            while (arr[j] < pivot) {
                j++;
            }
            while (arr[k] > pivot) {
                k--;
            }
            if (j <= k) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }
        }
        quickSort(arr, left, k);
        quickSort(arr, j, right);
    }
}
