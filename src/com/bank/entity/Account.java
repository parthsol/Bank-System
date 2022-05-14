package com.bank.entity;

public class Account {
    private int accountNo;
    private String accountType;
    private User user;
    private float currentBal;
    private String status;

    public Account(){

    }

    public Account(User user, String accountType){
        if(user==null){
            throw new RuntimeException("invalid user while creating account");
        }
        this.user = user;
        if(accountType==null || accountType.isEmpty()){
            throw new RuntimeException("invalid account type while creating account");
        }
        this.accountType = accountType;
    }

    public float getCurrentBal(){
        return this.currentBal;
    }

    public int getAccountNo(){
        return this.accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public User getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", user=" + user +
                ", currentBal=" + currentBal +
                ", status='" + status + '\'' +
                '}';
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCurrentBal(float currentBal) {
        this.currentBal = currentBal;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
