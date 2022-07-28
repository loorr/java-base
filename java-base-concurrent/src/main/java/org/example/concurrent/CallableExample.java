package org.example.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) {

        Callable<Integer> mc = new Task();
        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread thread = new Thread(ft);
        thread.start();

        System.out.println("main end");
        try {
            System.out.println(ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(200);
            }
            return new Random().nextInt(1000);
        }
    }
}
