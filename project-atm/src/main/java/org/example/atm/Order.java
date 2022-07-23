package org.example.atm;

import java.util.Date;

public abstract class Order {
    public String orderId;
    public double amount;
    public Date time;
    public boolean isSuccess;
}
