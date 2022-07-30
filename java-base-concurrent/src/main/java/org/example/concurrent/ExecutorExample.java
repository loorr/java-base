package org.example.concurrent;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        fixExecutor();
    }

    public static void fixExecutor(){
        // 固定线程池
        // ExecutorService executor = Executors.newFixedThreadPool(5);
        // 缓存线程池
        // ExecutorService executor2 = Executors.newCachedThreadPool();
        // 调度线程池
        // ExecutorService executor3 = Executors.newScheduledThreadPool(5);

        ExecutorService executors = Executors.newFixedThreadPool(5);
        ExecutorService executor1 = new ThreadPoolExecutor(8,8,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        executors.submit(() -> {
            System.out.println("hello1");
        });
        executors.submit(() -> {
            System.out.println("hello2");
        });
        executors.submit(() -> {
            System.out.println("hello3");
        });
    }

    public static void threadPoolExecutor(){

    }
}
