package org.example.data.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LFU implements Cache{
    private Map<Integer, Integer> map = new HashMap<>();
    private PriorityQueue<Integer> queue;

    public  LFU(int capacity) {
        queue = new PriorityQueue<>(capacity, (a, b) -> map.getOrDefault(b, 0) - map.getOrDefault(a, 0));
    }

    @Override
    public void put(int key, int value) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    @Override
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    @Override
    public void remove(int key) {
        map.remove(key);
        queue.remove(key);
    }

    @Override
    public void clear() {
        map.clear();
        queue.clear();
    }
}
