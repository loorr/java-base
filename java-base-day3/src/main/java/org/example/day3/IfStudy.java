package org.example.day3;

import java.util.Scanner;

public class IfStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age > 18){
            System.out.println("成年");
        }else {
            System.out.println("未成年");
        }

        if(age < 18){
            System.out.println("未成年");
        }else if (age > 18){
            System.out.println("成年");
        }else if( age>60 ){
            System.out.println("老年");
        }



    }
}
