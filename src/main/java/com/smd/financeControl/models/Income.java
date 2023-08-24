package com.smd.financeControl.models;

public class Income extends Transaction{
    public Income(String name, double amount, String description, Wallet wallet) {
        super(name, amount, description, wallet, null);
    }
}
