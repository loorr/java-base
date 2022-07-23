package org.example.day6.atm;

import java.util.Date;

public final class TransferOrder extends Order {
    private String orderId;
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private boolean isSuccess;
    private Date time = new Date();
    // private TransferOrderType type;


    public TransferOrder(String fromAccountId, String toAccountId, double amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public boolean getIsSuccess() {
        return isSuccess;
    }
}
