package org.example.atm;

public class AccountManagement {
    private static final Account[] accounts = new Account[10];
    private static int accountCount = 0;
    private static Account currentAccount;

    public static void openAccount(String userName, String password, String checkPassword) {
        assert !password.equals(checkPassword) : "Password and check password must be different";
        Account account = new Account(userName, password);
        accounts[accountCount] = account;
        accountCount++;
        System.out.println("开设账户成功: " + account.toString());
    }

    public static boolean  loginAccount(String accountId, String password){
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountId().equals(accountId) && accounts[i].getPassword().equals(password)) {
                System.out.println("登录成功: " + accounts[i].toString());
                currentAccount = accounts[i];
                return true;
            }
        }
        return false;
    }

}
