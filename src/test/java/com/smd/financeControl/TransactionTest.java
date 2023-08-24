package com.smd.financeControl;

import com.smd.financeControl.models.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionTest {

    @Test
    public void shouldVerifyAllInstancesCreated() {
        Wallet wallet = new Wallet(0.0);
        Bank bank = new Bank();

        Income income = new Income("", 0.0, "", wallet);
        Expense expense = new Expense("", 0.0, "", wallet);
        EmergencyFund fund = new EmergencyFund("", 0.0, "", bank);

        assertNotNull(income);
        assertNotNull(expense);
        assertNotNull(fund);
    }
}
