package com.smd.financeControl.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Long id;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Bank() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
