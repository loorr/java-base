package org.example.data.algorithm;

public interface Cache {
    void put(int key, int value);
    int get(int key);
    void remove(int key);
    void clear();
}
