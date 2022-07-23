package org.example.day4;


/**
 * java 方法
 */
public class Method {
    public static void main(String[] args) {
        // 静态方法调用
        // Method.compareStatic(1,1);
        int param1 = 1;
        int param2 = 2;
        int result = compareStatic(param1,param2);
        if (result == 1) {
            System.out.println("param1 大于param2");
        } else if (result == -1) {
            System.out.println("param1小于param2");
        } else {
            System.out.println("param1等于param2");
        }

        // Method2.compareStatic2(1,1);

        // 实例方法调用
//        Method m = new Method();
//        m.compareInstance(1,1);

        int n = getFinalNum(20);
        System.out.println(n);
    }

    // 静态方法
    // 比较两数大小
    public static int compareStatic(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int compareStatic(double a, double b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }



    // 实例方法
    // 比较两数组大小
    public int compareInstance(int a, int b) {
        return 0;
    }

    public static int getMax(int a, int b, int c){
        // 定义 max 变量
        int max = a;
        // if 条件判断出最大值
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        // 返回最大值
        return max;
    }


    public static int getMax(int[] arr){
        // 定义 max 变量
        int max = arr[0];
        // if 条件判断出最大值
        if(arr[1] > max){
            max = arr[1];
        }
        if(arr[2]> max){
            max = arr[2];
        }
        // 返回最大值
        return max;
    }

    public static int getFinalNum(int monthNum){
        if (monthNum < 0){
            return -1;
        }
        // 创建一个数组存放兔子每个月数量
        int [] arr = new int [monthNum];
        // 前两个月兔子对数都为1
        arr [0] = arr [1] = 1;
        for(int i = 2;i < arr.length;i++){
            arr[i] = arr [i-1] + arr[i - 2];
        }
        return arr[monthNum-1];
    }

}
