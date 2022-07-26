package org.example.day9;

public class Test1 implements Action{
    public static void print(String str) {
        System.out.println(str);
    }

    @Override
    public void solution() {
        print("Test1.solution()");
    }
}
