package com.smd.financeControl.models;

public class EmergencyFund extends Transaction {
    public EmergencyFund(String name, double amount, String date, String description, Bank bank) {
        super(name, amount, date, description, null, bank);
    }
}
