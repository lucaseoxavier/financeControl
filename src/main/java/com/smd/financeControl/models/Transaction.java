package com.smd.financeControl.models;

import com.smd.financeControl.utils.DateHelper;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Transaction {
    protected Long id;
    protected String name;
    protected double amount;
    @DateTimeFormat(pattern = DateHelper.DATE_FORMAT)
    protected Date date;
    protected String description;
    protected Wallet wallet;
    protected Bank bank;

    public Transaction(String name, double amount, String date, String description, Wallet wallet, Bank bank) {
        this.name = name;
        this.amount = amount;
        this.date = DateHelper.parseDate(date);
        this.description = description;
        this.wallet = wallet;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Bank getBank() {
        return bank;
    }
}
