package org.example.day3;

import java.util.Scanner;

public class WhileStudy {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            if (i %3 == 1){
                break;
            }
            System.out.println(i);
            i++;
            if (i == 5){
                continue;
            }
            System.out.println(i + "1");
        }

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        while (a > 0) {
//            System.out.println("hello");
//        }
//        System.out.println("end");

        do {

        } while (i > 0);
    }
}
