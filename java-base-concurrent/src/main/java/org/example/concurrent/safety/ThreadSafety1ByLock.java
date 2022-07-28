package org.example.concurrent.safety;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafety1ByLock {

    private static int count;
    private static final ReentrantLock lock = new ReentrantLock();

    private static void countPlus() {
        System.out.println("countPlus() start");
        lock.lock();
        count++;
        lock.unlock();
        System.out.println("countPlus() end");
    }

    public static void main(String[] args) {
        /**
         * 多线程问题原因：count++这行代码要分三步执行；1：读取；2：修改；3：写入。
         * 在这三步中，任何一步都可能被其他线程打断，导致值还没来得及写入，就被其他线程读取或写入，这就是多线程并行操作统一变量导致的问题。
         */
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                countPlus();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                countPlus();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            // 在线程中调用另一个线程的 join() 方法，会将当前线程挂起，而不是忙等待，直到目标线程结束。
            // 等待两个线程都运行结束后，再打印结果
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //期待结果是2000，但是结果会小于这个值
        System.out.println(count);
    }


}
