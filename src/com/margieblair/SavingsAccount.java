package com.margieblair;

public class SavingsAccount extends BankAccount {
    private int interest;

    public SavingsAccount(int accountNumber, int balance, String owner, int interest) {
        super(accountNumber, balance, owner, "Savings");
        this.interest = interest;
    }

    public void compoundInterest() {
        balance += (balance * ((float) interest / 100.0));
    }
}
