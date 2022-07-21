package org.example.day3;

public class Array {
    public static void main(String[] args) {
        // [0,0,0,0,0,0,0,0,0,0]
        int[] arr = new int[10];

        String[] arr3 = new String[10];
        Object[] arr4 = new Object[10];
        // 越界

        char[] arr2 = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 数组初始化
        int[] arr5 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }





    }
}
