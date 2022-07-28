package org.example.day10;

import java.util.Random;

public class Task extends Thread {
    private String name;
    private int num;

    public Task(String taskName, int a){
        this.name = taskName;
        this.num = a;
    }

    @Override
    public void run(){
        // 执行的逻辑
        for (int i = 0; i < 10; i++) {
            System.out.println("task " + name + " " + num);
            try {
                // 模拟耗时 1000ms ~ 1100ms
                Thread.sleep(1000*1+ new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
