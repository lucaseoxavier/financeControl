package com.smd.financeControl.models;

public class Expense extends Transaction{
    public Expense(String name, double amount, String date, String description, Wallet wallet) {
        super(name, amount, date, description, wallet, null);
    }
}
