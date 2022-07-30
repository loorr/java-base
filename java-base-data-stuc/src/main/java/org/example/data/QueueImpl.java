package org.example.data;

import java.util.LinkedList;

public class QueueImpl implements MyQueue{

    private LinkedList<Integer> list;

    public QueueImpl() {
        list = new LinkedList<>();
    }

    @Override
    public void offer(int value) {
        list.addLast(value);
    }

    @Override
    public int poll() {
        return list.removeFirst();
    }

    @Override
    public int peek() {
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
