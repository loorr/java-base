package org.example.day8.collection;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.Random;

public class ExceptionStudy {
    public static void main(String[] args) {
//        int a = 10;
//
//        for (int i = 0; i < 10; i++) {
//            try {
//                a = a/new Random().nextInt(10);
//                int b = 1;
//                int c = 2;
//            } catch (ArithmeticException  e) {
//                System.out.println("error");
//            } catch (Exception e){
//
//            }finally {
//                System.out.println("finally");
//            }
//            // 其他的语句
//        }
//        System.out.println(a);
//        int result = test2(0);
//        System.out.println(result);
        try {
            test3(2);
            test3(3);
            test3(4);
            test3(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // finally 可以放在 try 和 catch 之后，也可以放在 try 之前，也可以放在 try 之后。
    // finally & return
    public static int test(int a) {
        int result = 2;
        try {
            result = result/a;
        }catch (Exception e) {
            System.out.println("error");
        } finally {
            result += 1;
        }
        return result;
    }

    // a = 2
    // a = 0
    public static int test2(int a) {
        int result = 2;
        try {
            result = result/a;
            return result;
        }catch (Exception e) {
            System.out.println("error");
        } finally {
            result += 1;
        }
        return result;
    }

    public static void test3(int a) throws Exception, RuntimeException {
        if (a > 0){
            throw new Exception("a 不能大于0");
        }
        if (a < 0){
            throw new RuntimeException("a 不能小于0");
        }
    }
}
