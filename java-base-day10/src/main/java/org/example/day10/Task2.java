package org.example.day10;

import java.util.Random;

public class Task2 implements Runnable{

    private String name;
    private int num;

    public Task2(String taskName, int a){
        this.name = taskName;
        this.num = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " " + num);
            try {
                // 模拟耗时 1000ms ~ 1100ms
                Thread.sleep(1000*1+ new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
