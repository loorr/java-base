package org.example.day5;

public class Admin extends Teacher implements Action, Action2{

    public void adminMethod() {
        System.out.println("Admin method");
    }

    @Override
    public void goClassRoomWay() {
        System.out.println("Admin goClassRoomWay");
    }

    @Override
    public void method1() {
        System.out.println("Admin method1");
    }

    @Override
    public void method2() {
        System.out.println("Admin method2");
    }

    @Override
    public void action2method1() {
        System.out.println("Admin action2method1");
    }
}
