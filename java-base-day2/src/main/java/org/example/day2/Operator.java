package org.example.day2;

/**
 * 运算符
 */
public class Operator {
    public static void main(String[] args) {
        // + - * / % ++ --
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println(result);

        // 不同类型除法
        int c = 4;
        int d = 3;
        double result2 = c*1.0 / d;
        System.out.println(c*1.0 / d);
        System.out.println(result2);

        double result3 = (double)c/d;
        System.out.println(result3);

        double e = 1.0/0;
        System.out.println(e);

        // mod
        int f = 12%7;
        System.out.println(f);

        int g = 1;
        //g++; // g=g+1;
        System.out.println(1 + g++);
        g = 1;
        //++g; // g=g+1;
        System.out.println(1+ ++g);

        System.out.println("g++");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("++g");
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }



        // 布尔运算 && || !
        boolean a1 = true;
        boolean b1 = false;

        // && 只有两个都为true时才为true   and和运算
        // true && true = true
        // true && false = false

        // || 只有两个都为false时才为false   or和运算
        // false || false = false
        // true || false = true
        // true || true = true

        // ! 只有一个为true时才为false   not和运算
        // !true = false
        // !false = true
        int bb1 =  1;
        int bb2 = 1;
        // 0 false
        // 1 true

        // 关系运算 == != > < >= <=
        // == 相等
        int a2 = 1;
        int b2 = 2;
        System.out.println(a2 == b2);
        System.out.println(a2 > b2);

        double a3 = 1.0;
        double b3 = 1.0;
        System.out.println(a3 == b3);

        String s1 = "hihi";
        String s2 = "hihi";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        int a4 = 1; // 32位的int
        byte b4 = 1; // 8位的byte
        // 位运算
        // & | ^ ~ << >> >>>
        // & 取二进制的最低位为1的位，如果最低位为0，则为0，否则为1
        // | 取二进制的最低位为0的位，如果最低位为1，则为1，否则为0
        // ^ 取二进制的最低位为0的位，如果最低位为1，则为1，否则为0
        // ~ 取二进制的最低位为1的位，如果最低位为0，则为1，否则为0
        // << 左移，将二进制的最低位为1的位向左移动指定的位数，如果最低位为0，则为0，否则为1
        // >> 右移，将二进制的最低位为1的位向右移动指定的位数，如果最低位为0，则为0，否则为1
        byte b5 = 4; // 0000 0010
        byte b6 = 3; // 0000 0011
        System.out.println(b5 & b6); // 0000 0010
        // 异或 1^1 = 0 0^1 = 1 1^0 = 1 0^0 = 0
        System.out.println(b5 ^ b6); // 0000 0001

        // 0000 0011 -> 0000 0110
        System.out.println(b6 << 1);

        // 0000 0011 -> 0000 0001
        System.out.println(b6 >> 1);

        System.out.println(((1 + 2) *3) + 1 / 4 %5);

    }
}
