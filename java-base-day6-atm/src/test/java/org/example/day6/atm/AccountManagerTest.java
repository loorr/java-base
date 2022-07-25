package org.example.day6.atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void openAccountTest() {
        // TODO add test code here
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        assertNotNull(account);
        assertNotNull(account.accountId);

        Account account1 = AccountManager.openAccount("张三", "1234561", "123456");
        assertNull(account1);
    }

    @Test
    void closeAccountTest() {
        // TODO add test code here

    }

    @Test
    void depositTest() {
        // TODO add test code here
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        assertNotNull(account);
        assertNotNull(account.accountId);
        AccountManager.loginAccount("张三", "123456");

        AccountManager.deposit(100);
        assertEquals(100, account.balance);
    }

    @Test
    void loginAccountTest() {
        // TODO add test code here
        Account account = AccountManager.openAccount("张三", "123456", "123456");
        assertTrue(AccountManager.loginAccount(account.accountId, "123456"));
        assertFalse(AccountManager.loginAccount(account.accountId, "1234561"));
        assertFalse(AccountManager.loginAccount(null, "123456"));
        assertFalse(AccountManager.loginAccount("", "123456"));
        // account.closeAccount();
    }

    @Test
    void privateTest(){
        try {
            Class<?> clazz = Class.forName(AccountManager.class.getName());
            AccountManager manager = (AccountManager) clazz.newInstance();
            Method method = clazz.getDeclaredMethod("privateMethod", String.class);
            method.setAccessible(true);
            method.invoke(manager," hi");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void privateStaticTest(){
        try {
            Class<?> clazz = Class.forName(AccountManager.class.getName());
            Method method = clazz.getDeclaredMethod("privateStaticMethod", String.class);
            method.setAccessible(true);
            method.invoke(clazz," hi");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    void privateStaticTestByPowerMock(){
        try {
            Whitebox.invokeMethod(AccountManager.class,"privateStaticMethod"," hi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    void privateTestByPowerMock(){
        try {
            AccountManager accountManager = new AccountManager();
            Whitebox.invokeMethod(accountManager,"privateMethod"," hi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}