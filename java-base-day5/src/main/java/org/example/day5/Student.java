package org.example.day5;

public class Student  extends People implements Action {
    public static String school = "SCU";
    public static final Student STUDENT = new Student("王五", 20, "一班", 123456789);

    public String theClass;
    public long stuId;
    private ClassEnum classEnum;
    private Address address;


    public Student() {
    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age, String theClass, long stuId) {
        this.name = name;
        //this.age = age;
        this.theClass = theClass;
        this.stuId = stuId;
        this.address = new Address();
        this.address.city = "chengdu";
    }

    public static void print(String name) {
        System.out.println(name);
    }

    public static int compareAge(int age1, int age2){
        return -1;
    }

    @Override
    public void goClassRoomWay() {
        System.out.println("Student goClassRoomWay");
    }

    @Override
    public void method1() {
        System.out.println("Student method1");
    }

    @Override
    public void method2() {
        System.out.println("Student method2");
    }


}
