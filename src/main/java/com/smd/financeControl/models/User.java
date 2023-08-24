package com.smd.financeControl.models;

public class User {
    private Long id;
    private String name;
    private String email;
    private Wallet wallet;
    private Bank bank;


    public User(String name, String email, double budgetAmount) {
        this.name = name;
        this.email = email;
        this.wallet = new Wallet(budgetAmount);
        this.bank = new Bank();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Bank getBank() {
        return bank;
    }
}
