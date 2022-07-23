package org.example.day6.atm;

import java.util.Date;

public abstract class Order {
    public String orderId;
    public boolean isSuccess;
    public final Date time = new Date();

    protected abstract boolean getIsSuccess();
    
    protected abstract String getOrderId();

}
