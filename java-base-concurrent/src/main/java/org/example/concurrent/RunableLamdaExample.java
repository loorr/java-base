package org.example.concurrent;

public class RunableLamdaExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println("[task " + Thread.currentThread().getName() + "] " + j);
                }
            }).start();
        }
    }
}
