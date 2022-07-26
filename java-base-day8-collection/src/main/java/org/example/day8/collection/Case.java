package org.example.day8.collection;

import java.util.*;

public class Case {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);
        List<Integer> list2 = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }

        for (int i = 0; i < 20; i++) {
            list2.add(new Random().nextInt(10));
        }
        // 将两个数组元素去重
        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            set2.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            set2.add(list2.get(i));
        }
        System.out.println(set);
        
    }
}
