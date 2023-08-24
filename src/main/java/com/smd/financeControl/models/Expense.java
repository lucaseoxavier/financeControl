package com.smd.financeControl.models;

public class Expense extends Transaction{
    public Expense(String name, double amount, String description, Wallet wallet) {
        super(name, amount, description, wallet, null);
    }
}
