package org.example.day8.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        // O(1)
        Set<String> set = new HashSet<>();
        set.add("a");


        // O(1)
        Set<Integer> treeSet = new TreeSet<>();
        // log(n)
        treeSet.add(1);


        // set.contains("a");

    }
}
