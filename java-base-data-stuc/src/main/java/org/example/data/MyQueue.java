package org.example.data;

public interface MyQueue {
    void offer(int value);
    int poll();
    int peek();
    boolean isEmpty();
}
