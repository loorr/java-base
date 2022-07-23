package org.example.atm;

import java.util.Random;

public class Account {
    private double balance;
    private String accountId;
    private String password;
    private String userName;
    private TransferOrder[] transferOrders;

    public Account(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.accountId = getRandom(6);
    }

    private static String getRandom(int len) {
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < len; i++) {
            rs.append(r.nextInt(10));
        }
        return rs.toString();
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(Account to, double amount){
        assert balance > amount : "Balance is not enough";
        to.deposit(balance);
        withdraw(balance);
    }

    public String getAccountId(){
        return accountId;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString(){
        return "账户号: " + accountId + " 姓名: " + userName + " 当前余额: " + balance;
    }
}
