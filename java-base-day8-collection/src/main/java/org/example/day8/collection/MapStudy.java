package org.example.day8.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        // 学生姓名 -> 学生学号
        Map<String, Integer> map = new HashMap<>();

        map.put("小王", 11111);
        map.put("小王", 22222);
        Integer stuNum = map.get("小王");
        map.containsKey("小王");

        System.out.println(stuNum);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println(map.getOrDefault("小王1", 0));

        Map<String,String> map1 = new LinkedHashMap<>();
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
        Set<Map.Entry<String, String>> set2 = map2.entrySet();
        for (Map.Entry<String,  String> entry : set2) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
