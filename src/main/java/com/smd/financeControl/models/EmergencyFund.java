package com.smd.financeControl.models;

public class EmergencyFund extends Transaction {
    public EmergencyFund(String name, double amount, String description, Bank bank) {
        super(name, amount, description, null, bank);
    }
}
