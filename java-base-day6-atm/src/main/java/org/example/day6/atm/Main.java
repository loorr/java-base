package org.example.day6.atm;

import org.example.day6.atm.exception.NoAccountException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printWelcome();
        printMainMenu();
    }

    public static void printWelcome(){
        System.out.println("=== Welcome to the ATM System ===");
    }

    public static void printMainMenu(){
        System.out.println("=== 主菜单 ===");
        System.out.println("1.开设账户");
        System.out.println("2.登录账户");
        System.out.println("3.退出");
        Scanner in = new Scanner(System.in);
        // 假定用户输入都是符合预期的
        int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.println("=== 开设账户 ===");
                System.out.println("请输入 姓名: ");
                String userName = in.next();
                System.out.println("请输入 密码: ");
                String password = in.next();
                System.out.println("请输入 确认密码: ");
                String checkPassword = in.next();
                Account result = AccountManager.openAccount(userName, password, checkPassword);
                if (result != null){
                    System.out.println("开户成功!!!");
                    System.out.println("账号: " + result.accountId);
                }else{
                    System.out.println("开户失败!!!");
                }
                printMainMenu();
                break;
            case 2:
                System.out.println("=== 登录账户 ===");
                System.out.println("请输入 账号: ");
                String accountId = in.next();
                System.out.println("请输入 密码: ");
                String pwd = in.next();
                try {
                    boolean isLogin = AccountManager.loginAccount(accountId, pwd);
                    if (isLogin) {
                        System.out.println("登录成功!!!");
                        printUserMenu();
                    }else {
                        System.out.println("登录失败!!!");
                        printMainMenu();
                    }
                }catch (NoAccountException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.println("=== 退出 ===");
                break;
            default:
                System.out.println("输入错误!!!");
                printMainMenu();
                break;
        }
    }

    private static void printUserMenu() {
        System.out.println("=== 用户菜单 ===");
        System.out.println("1.提现");
        System.out.println("2.存钱");
        System.out.println("3.转账");
        System.out.println("4.查询余额");
        System.out.println("5.查询存取款记录");
        System.out.println("6.查询转账记录");
        System.out.println("7.退出");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("=== 提现 ===");
                System.out.println("请输入 提现金额: ");
                double amount = in.nextDouble();
                double balance = AccountManager.withdraw(amount);
                System.out.println("取现成功，金额为: " + amount + ", 余额为: " + balance);
                printUserMenu();
                break;
            case 2:
                System.out.println("=== 存钱 ===");
                System.out.println("请输入 存钱金额: ");
                amount = in.nextDouble();
                balance = AccountManager.deposit(amount);
                System.out.println("您的余额为: " + balance);
                printUserMenu();
                break;
            case 3:
                System.out.println("=== 转账 ===");
                System.out.println("请输入 转账账号: ");
                String toAccountId = in.next();
                System.out.println("请输入 转账用户名: ");
                String toUserName = in.next();
                System.out.println("请输入 转账金额: ");
                amount = in.nextDouble();
                boolean result = AccountManager.transfer(toAccountId, toUserName, amount);
                if (result){
                    System.out.println("转账成功!!!");
                }else{
                    System.out.println("转账失败!!!");
                }
                printUserMenu();
                break;
            case 4:
                System.out.println("=== 查询余额 ===");
                balance = AccountManager.getBalance();
                System.out.println("您的余额为: " + balance);
                printUserMenu();
                break;
            case 5:
                System.out.println("=== 退出 ===");
                printMainMenu();
                break;
            default:
                System.out.println("输入错误!!!");
                printUserMenu();
                break;
        }
    }

}
