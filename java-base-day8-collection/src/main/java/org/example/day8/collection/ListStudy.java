package org.example.day8.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        //list.get(index)

        //list.add(index, value)
        //list.add(value)

        //list.remove(index)
        // list.remove(list.size() - 1);

        //list.contains(value)
        //list.isEmpty()
        //list.size()

        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
            list2.add(String.valueOf(i));
        }

        System.out.println(list);
    }
}
