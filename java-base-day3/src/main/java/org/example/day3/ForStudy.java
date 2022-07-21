package org.example.day3;

public class ForStudy {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        // 1 加到100 的结果
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
