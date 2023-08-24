package com.smd.financeControl.models;

public class Income extends Transaction{
    public Income(String name, double amount, String date, String description, Wallet wallet) {
        super(name, amount, date, description, wallet, null);
    }
}
