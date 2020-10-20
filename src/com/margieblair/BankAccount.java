package com.margieblair;

public abstract class BankAccount {
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

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            return;
        }
        System.out.println("Insufficient funds to make this transaction.");
        return;
    }

    public String getDetails() {
        return acctType + " Account\nOwner: " + owner + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
    }
}
