package com.ynov;

import com.ynov.domain.BankAccount;
import com.ynov.threading.banking.BankDeposit;
import com.ynov.threading.banking.BankWithdrawal;

public class Exercise3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankWithdrawal withdrawal = new BankWithdrawal(bankAccount);
        BankDeposit deposit = new BankDeposit(bankAccount);
        withdrawal.start();
        deposit.start();
        try {
            Thread.sleep(100);
            System.out.println(String.format("Balance is at %.2f", bankAccount.getBalance()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
