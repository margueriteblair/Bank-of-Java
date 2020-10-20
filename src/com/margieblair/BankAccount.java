package com.margieblair;

public class BankAccount {
    private int accountNumber;
    private String owner;
    protected int balance;
    private String acctType;

    public BankAccount(int accountNumber, int balance, String owner, String acctType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.acctType = acctType;
    }
}
