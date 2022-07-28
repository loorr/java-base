package org.example.concurrent;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        int a = 10;
        for (int i = 0; i < 10; i++) {
            a ++;
        }
    }
}
