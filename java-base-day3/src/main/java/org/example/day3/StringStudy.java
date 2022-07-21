package org.example.day3;

import java.util.Locale;

/**
 *
 */
public class StringStudy {
    public static void main(String[] args) {

        // 字符串拼接
        String str2 = "hello" + " world";

        String s = " world";
        String str31 = "hello".concat(s);
        System.out.println(str31);

        // 构建字符串
        String str = "hello world";
        System.out.println(str);
        // 字符串拼接 新建对象
        String str3 = new String("hello-world");
        System.out.println(str3.length());
        System.out.println(str3.charAt(str3.length()-1));

        System.out.println(str2.indexOf('o'));

        String sub  = str3.substring(0, 5);
        System.out.println(sub);

        String str4 = str3.replace("world", "java");
        System.out.println(str4);

        String str6 = new String("hello-world");
        String[] strArr = str6.split("-");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(i + " " + strArr[i]);
        }


        System.out.println("        abcBDE  ".toUpperCase());
        System.out.println("        abcBDE  ".toLowerCase());
        System.out.println("        abcBDE  ".trim());

        // "hello-world" -> ['h', 'e', ..... 'w', 'o', 'r', 'l', 'd']

        // https://www.zhihu.com/?utm_source=gold_browser_extension&param2=1212121
        String params = "gold_browser_extension";
        String param2 = "12112121";
        String prefix = "https://www.zhihu.com/?utm_source=";
        String url = prefix + params + "&param2" + param2;


        String prefixTemple = "https://www.zhihu.com/?utm_source=%s&param2=%s";
        System.out.println(String.format(prefixTemple, params, param2));


    }
}
