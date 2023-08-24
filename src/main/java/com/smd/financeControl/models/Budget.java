package com.smd.financeControl.models;

public class Budget {
    private Long id;
    private double budgetAmount;

    public Budget(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public double getBudgetAmount() {
        return budgetAmount;
    }
}
