package org.example.day6.atm;

import java.util.Date;
import java.util.Random;

public final class CashOrder extends Order {

    private String accountId;
    private double amount;
    // withdraw or deposit
    private CashEnum type;

    public CashOrder(String accountId, CashEnum type, double amount, boolean isSuccess) {
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.orderId = getRandomOrderId(accountId);
        this.isSuccess = isSuccess;
        //super.time = new Date();
    }

    private String getRandomOrderId(String prefix) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(prefix);
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    public String getAccountId() {
        return accountId;
    }

    public Date getTime() {
        return time;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public double getAmount() {
        return amount;
    }

    public CashEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CashOrder [orderId=" + orderId + ", accountId=" + accountId + ", time=" + time + ", isSuccess="
                + isSuccess + ", amount=" + amount + ", type=" + type + "]";
    }

    @Override
    protected boolean getIsSuccess() {
        return isSuccess;
    }
}
