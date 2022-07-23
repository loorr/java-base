package org.example.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcome();
        printMainMenu();
    }

    public static void welcome(){
        System.out.println("=== Welcome to the ATM System ===");
    }

    public static void printMainMenu(){
        System.out.println("=== 主菜单 ===");
        System.out.println("1.开设账户");
        System.out.println("2.登录账户");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1){
            System.out.println("=== 开设账户 ===");
            System.out.println("请输入 姓名: ");
            String userName = in.next();
            System.out.println("请输入 密码: ");
            String password = in.next();
            System.out.println("请输入 确认密码: ");
            String checkPassword = in.next();
            AccountManagement.openAccount(userName, password, checkPassword);
        }else if(choice == 2){
            System.out.println("=== 登录账户 ===");
            System.out.println("请输入 账号: ");
            String accountId = in.next();
            System.out.println("请输入 密码: ");
            String password = in.next();
            boolean isLogin = AccountManagement.loginAccount(accountId, password);
            if (isLogin){
                printAccountMenu();
                return;
            }else{
                System.out.println("登录失败, 账号或密码错误!!!");
            }
        }
        printMainMenu();
    }

    private static void printAccountMenu() {
        System.out.println("1.查询余额");
        System.out.println("2.取款");
        System.out.println("3.存款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                //System.out.println("余额: " + currentAccount.getBalance());
                break;
            case 2:
                System.out.println("请输入取款金额: ");
                double withdrawAmount = in.nextDouble();
                //currentAccount.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.println("请输入存款金额: ");
                double depositAmount = in.nextDouble();
               // currentAccount.deposit(depositAmount);
                break;
            case 4:
                System.out.println("请输入转账账号: ");
                String toAccountId = in.next();
                System.out.println("请输入转账金额: ");
                double transferAmount = in.nextDouble();
                //currentAccount.transfer(toAccountId, transferAmount);
                break;
            case 5:
                System.out.println("请输入新密码: ");
                String newPassword = in.next();
                //currentAccount.changePassword(newPassword);
                break;
            case 6:
                System.out.println("退出登录");
                printMainMenu();
                break;
        }
    }
}
