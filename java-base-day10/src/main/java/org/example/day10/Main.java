package org.example.day10;

public class Main {
    private static int THREAD_NUM = 10;


    public static void main(String[] args) {
        //        for (int i = 0; i < 5; i++) {
        //            Task task = new Task("task" + i, i*i);
        //            task.start();
        //        }

        for (int i = 0; i < 5; i++){
            Thread thread = new Thread(new Task2("task" + i, i*i));
            thread.start();
        }
        System.out.println("main thread end");
    }

    private void test1(){
        THREAD_NUM ++;
    }

    private void test2(){

    }
}
