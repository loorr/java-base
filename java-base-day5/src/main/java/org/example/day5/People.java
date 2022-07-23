package org.example.day5;

public class People {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        ageAA();
    }

    private void privateMethod(String name) {
        System.out.println(name);
    }

    private void ageAA(){
        this.age ++;
    }
}
