package org.example.day8.collection;

import java.util.*;
import java.util.stream.Collectors;

public class StreamStudy {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }


//        for (int i = 0; i < 10; i++) {
//            Integer o = list1.get(i);
//            System.out.println(list1.get(i));
//        }
//        // stream 遍历
//        list1.stream().forEach(o -> {
//            Integer i = o + 1;
//            System.out.println(i);
//        });
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            set.add(list1.get(i));
        }

        // 排序
        list1.stream()
                .sorted((o1, o2) -> {
                   return o2-o1;
                })
                .filter(o -> o > 1)
                .distinct()
                .forEach(o -> {
            System.out.println(o);
        });

        // map
        Set<String> set2 = list1.stream().map(o -> {
           return o.toString();
        }).collect(Collectors.toSet());
    }
}
