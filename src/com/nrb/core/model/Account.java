package com.nrb.core.model;

import java.util.Date;

public class Account {
    private String id;
    private String accountType;
    private Float balance;
    private Date accountOpenedDate;
    private String status;

    public Account() {
    }

    public Account(String id,
                   String accountType,
                   Float balance,
                   Date accountOpenedDate,
                   String status) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
        this.accountOpenedDate = accountOpenedDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(Date accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
