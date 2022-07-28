package org.example.concurrent;

import java.util.Random;

public class LamdaExample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("[task " + Thread.currentThread().getName() + "] " + i);
                    try {
                        // 模拟耗时 1000ms ~ 1100ms
                        Thread.sleep(1000*1+ new Random().nextInt(100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        new Thread(()->{
            System.out.println("hello1");
        }).start();

        new Thread(()->{
            // 执行的逻辑
            for (int i = 0; i < 10; i++) {
                System.out.println("[task ] " + i);
                try {
                    // 模拟耗时 1000ms ~ 1100ms
                    Thread.sleep(1000*1+ new Random().nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
