package com.bank.entity;

import java.util.Date;

public class Transaction {
    private int txId;
    private String txType;
    private Account fromAccount;
    private Account toAccount;
    private Date txDate;
    private float txAmt;

    public int getTxId() {
        return txId;
    }

    public String getTxType() {
        return txType;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public Date getTxDate() {
        return txDate;
    }

    public float getTxAmt() {
        return txAmt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txId=" + txId +
                ", txType='" + txType + '\'' +
                ", fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", txDate=" + txDate +
                ", txAmt=" + txAmt +
                '}';
    }
}
