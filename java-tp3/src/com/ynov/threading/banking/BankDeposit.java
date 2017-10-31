package com.ynov.threading.banking;

import com.ynov.domain.BankAccount;

public class BankDeposit extends Thread {

    private final BankAccount bankAccount;
    private static double AMOUNT = 100;
    private static int ITERATIONS = 10;
    private boolean loop =true;


    public BankDeposit(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < ITERATIONS; i++) {
                bankAccount.credit(AMOUNT);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
