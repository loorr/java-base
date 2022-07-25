package org.example.day6.atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferOrderTest {

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void getOrderId() {
        System.out.println("getOrderId");
    }

    @Test
    void getFromAccountId() {
        System.out.println("getFromAccountId");
    }

    @Test
    void getToAccountId() {
        System.out.println("getToAccountId");
    }

    @Test
    void getAmount() {
        System.out.println("getAmount");
    }

    @Test
    void getTime() {
        System.out.println("getTime");
    }

    @Test
    void getIsSuccess() {
        Assertions.assertNotNull(new TransferOrder("1", "2", 1.0));
        System.out.println("getIsSuccess");
    }
}