package com.smd.financeControl.models;

public class Transaction {
    protected Long id;
    protected String name;
    protected double amount;
    protected String description;
    protected Wallet wallet;
    protected Bank bank;

    public Transaction(String name, double amount, String description, Wallet wallet, Bank bank) {
        this.name = name;
        this.amount = amount;
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
