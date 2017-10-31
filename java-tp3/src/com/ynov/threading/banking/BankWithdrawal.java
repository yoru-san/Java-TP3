package com.ynov.threading.banking;

import com.ynov.domain.BankAccount;

public class BankWithdrawal extends Thread {

    private final BankAccount bankAccount;
    private static double AMOUNT = 100;
    private static int ITERATIONS = 10;
    private boolean loop =true;


    public BankWithdrawal(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                for (int i = 0; i < ITERATIONS; i++) {
                    bankAccount.debit(AMOUNT);
                    //sleep(1000);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
