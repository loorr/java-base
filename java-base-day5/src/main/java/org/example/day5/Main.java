package org.example.day5;

import java.util.List;

public class Main {
    public static final Student STUDENT = new Student("王五", 20, "一班", 123456789);

    public static void main(String[] args) {
//        Student stu1 = new Student();
//        stu1.name = "张三";
//        stu1.age = 18;
//        stu1.theClass = "一班";
//        stu1.setName("李四");
//
//        STUDENT.stuId = 111L;
//
          Student stu2 = new Student();
          stu2.name = "李四";
          stu2.setAge(1);

          stu2.theClass = "一班";
//
//
//        Student stu3 = new Student("王五");
//        stu2.name = "王四";
//        stu2.age = 20;
//        stu2.theClass = "一班";
//        //stu2.stuId = 111L;
//
//        Student stu4 = new Student("王五", 20, "一班", 123456789);
//
//
//        Student.print("gh~");
//        System.out.println(Student.school);
//
//        System.out.println(stu3.name);

        Admin admin = new Admin();
        admin.method1();
        admin.action2method1();

        Action actionAdmin = new Admin();
        actionAdmin.method1();

        Action actionStu = new Student();
        actionStu.method1();


        People people = new Student();

        System.out.println(ClassEnum.CLASS_1.name());
    }
}
