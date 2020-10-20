package com.margieblair;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, int balance, String owner) {
        super(accountNumber, balance, owner, "Checking");
    }
}
