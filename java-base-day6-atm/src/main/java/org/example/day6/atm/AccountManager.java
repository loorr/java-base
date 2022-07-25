package org.example.day6.atm;

import java.util.*;

public class AccountManager {
     public static Account[] accounts = new Account[100];
//    public static final List<Account> accounts = new ArrayList<>();

    public static int currentAccountIndex = 0;
    public static Account currentAccount = null;

    private void privateMethod(String str) {
        System.out.println("private method" + str);
    }

    private static void privateStaticMethod(String str) {
        System.out.println("private method" + str);
    }

    public void test() {
        // 申明
        List<Integer> list = new ArrayList<>();
        Integer[] arr = new Integer[10];

        // 取值
        // arr[index]
        //list.get(index)

        // 赋值
        // arr[index] = value
        // list.add(value); 存最末尾
        // list.add(index, value); // 存指定位置


        // 判断是否包含
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == value) {
//                System.out.println("包含");
//            }
//        }
        //list.contains(value);



//        List<Long> list = new ArrayList<>();
//        List<Double> list = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//
//        Set<String> set = new HashSet<>();
//        Set<String> set1 = new TreeSet<>();
//
//        Map<String, Account> map = new HashMap<>();
    }

    public static Account openAccount(String username, String password, String checkPassword) {
        if (!password.equals(checkPassword)) {
            System.out.println("两次输入的密码不一致");
            return null;
        }
        if (username == null || username.length() == 0){
            System.out.println("用户名不能为空");
            return null;
        }
        Account account = new Account();
        account.username = username;
        account.password = password;
        account.accountId = getRandomAccountId();
        accounts[currentAccountIndex] = account;
        currentAccountIndex ++;
        return account;
    }

    private static void reSize(){
        Account[] newAccounts = new Account[accounts.length * 2];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        accounts = newAccounts;
    }

    /**
     * 随机生成6位数字的账号
     * @return
     */
    private static String getRandomAccountId() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }


    public static boolean loginAccount(String accountId, String password) {
        // TODO 登录逻辑
        for (int i = 0; i < currentAccountIndex; i++) {
            Account account = accounts[i];
            if(account == null) {
                continue;
            }
            if (account.accountId.equals(accountId) && account.password.equals(password)) {
                currentAccount = account;
                return true;
            }
        }
        return false;
    }

    // 登录之后才能调用
    public static double withdraw(double amount) {
        // TODO 提现逻辑
        if(currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        if (amount <= 0) {
            System.out.println("提现金额必须大于0");
            return -1;
        }
        if (amount >= currentAccount.balance) {
            System.out.println("余额不足");
            return -1;
        }
        currentAccount.balance -= amount;
        CashOrder cashOrder = new CashOrder(currentAccount.accountId, CashEnum.WITHDRAW, amount, true);
        currentAccount.addCashOrder(cashOrder);
        System.out.println("提现成功: " + amount + ", 当前余额为：" + currentAccount.balance);
        return amount;
    }

    // 存钱
    public static double deposit(double amount) {
        if(currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        if (amount <= 0) {
            System.out.println("存入金额必须大于0");
            return -1;
        }
        currentAccount.balance += amount;
        // TODO 存钱逻辑
        return amount;
    }

    public static double getBalance() {
        if(currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return -1;
        }
        // TODO 获取余额逻辑
        return 0;
    }

    public static boolean transfer(String toAccountId, String toUsername, double amount) {
        if(currentAccount == null){
            System.out.println("请先登录");
            Main.printMainMenu();
            return false;
        }
        // 不能向自己转账

        Account toAccount = getAccountByIdAndUsername(toAccountId, toUsername);
        if (toAccount == null){
            System.out.println("账户不存在");
            return false;
        }
        if (amount <= 0) {
            System.out.println("转账金额必须大于0");
            return false;
        }
        if (amount >= currentAccount.balance) {
            System.out.println("余额不足");
            return false;
        }
        currentAccount.balance -= amount;
        //其他操作 比如记录转账记录
        toAccount.balance += amount;
        return true;
    }

    private static Account getAccountByIdAndUsername(String accountId, String username) {
        for (int i = 0; i < currentAccountIndex; i++) {
            Account account = accounts[i];
            if(account == null) {
                continue;
            }
            if (account.accountId.equals(accountId) && account.username.equals(username)) {
                return account;
            }
        }
        return null;
    }

    public static void logout() {
        currentAccount = null;
    }
}
