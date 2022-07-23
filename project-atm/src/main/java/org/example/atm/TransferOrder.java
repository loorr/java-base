package org.example.atm;


public class TransferOrder extends Order{
    private String fromAccountId;
    private String toAccountId;
    private String message;
    private TransferEnum transferType;

    public TransferOrder(String fromAccountId, String toAccountId, double amount) {
        this.amount = amount;
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
    }
}
