package com.smd.financeControl.models;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private Long id;
    double balance;
    private List<Transaction> transactions = new ArrayList<>();
    private Budget budget;

    public Wallet(double budgetAmount) {
        this.budget = new Budget(budgetAmount);
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Budget getBudget() {
        return budget;
    }
}
