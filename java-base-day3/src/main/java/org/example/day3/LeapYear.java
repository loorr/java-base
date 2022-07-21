package org.example.day3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }

        if (year %4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("是闰年");
                } else {
                    System.out.println("不是闰年");
                }
            } else {
                System.out.println("不是闰年");
            }
        }else{
            System.out.println("不是闰年");
        }
    }
}
