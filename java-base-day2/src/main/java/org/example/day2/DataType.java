package org.example.day2;

/**
 * 数据类型
 */
public class DataType {
    public static void main(String[] args) {
        // 基本数据类型
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;
        float f = 1.0f;
        double d = 1.0;
        char c = 'a';
        boolean bool = true;

        final int finalInt = 1;


        // 引用数据类型
        String str = null;
        System.out.println(str);
        str= "hello" + " world";
        System.out.println(str);


        // 引用数据类型
        Object obj = new Object();
        // 引用数据类型
        String str2 = new String("hello");
        // 引用数据类型
        String str3 = "hello";
        // 引用数据类型
        String str4 = str3;

        // 引用数据类型
        String str5 = str3.intern();
        // 引用数据类型
        String str6 = new StringBuilder("hello").toString();
        // 引用数据类型
        String str7 = new StringBuffer("hello").toString();
        // 引用数据类型
        String str8 = new StringBuilder("hello").append("world").toString();
        // 引用数据类型
        String str9 = new StringBuffer("hello").append("world").toString();
        // 引用数据类型
        String str10 = new StringBuilder("hello").append("world").toString();
        // 引用数据类型
        String str11 = new StringBuffer("hello").append("world").toString();
        // 引用数据类型
        String str12 = new StringBuilder("hello").append("world").toString();
        // 引用数


        // 强制类型转换
        // 表示范围更大 更精确的 转化为更小的
        double d1 = 1.10000000002;
        System.out.println(d1);
        float f1 = (float)d1;
        int i1 = (int)d1;
        System.out.println(f1);
        System.out.println(i1);

        // 小 -> 大 short -> int -> long -> float -> double
        float f2 = 1.1f;
        double d2 = f2;
        System.out.println(d2);


    }



}
