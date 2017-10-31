package com.ynov.domain;

public class BankAccount {
    private double balance = 0;
    private boolean valueSet =true;

    public double getBalance() {
        return balance;
    }

    public synchronized void credit(double amount) {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        balance += amount;
        System.out.println(String.format("Balance is incremented and now at %.2f", balance));
        valueSet = false;
        notify();

    }

    public synchronized void debit(double amount) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        balance -= amount;
        System.out.println(String.format("Balance is decremented and now at %.2f", balance));
        valueSet = true;
        notify();



    }
}
