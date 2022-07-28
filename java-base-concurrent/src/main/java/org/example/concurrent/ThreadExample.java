package org.example.concurrent;

import java.util.Random;

public class ThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Task(String.valueOf(i)).start();
        }
    }
}