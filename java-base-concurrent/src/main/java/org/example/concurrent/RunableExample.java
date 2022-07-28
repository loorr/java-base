package org.example.concurrent;

import java.util.Random;

public class RunableExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
           new Thread(new Task(String.valueOf(i))).start();
        }
    }

    static class Task implements Runnable{
        private String taskName;

        public Task(String taskName){
            this.taskName = taskName;
        }

        @Override
        public void run(){
            // 执行的逻辑
            for (int i = 0; i < 10; i++) {
                System.out.println("[task " + taskName + "] " + i);
                try {
                    // 模拟耗时 1000ms ~ 1100ms
                    Thread.sleep(200*1+ new Random().nextInt(300));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
