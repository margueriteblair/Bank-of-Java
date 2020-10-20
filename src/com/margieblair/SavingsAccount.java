package com.margieblair;

public class SavingsAccount extends BankAccount {
    private int interest;
    private int txLimit;
    private int txCount;

    public SavingsAccount(int accountNumber, int balance, String owner, int interest) {
        super(accountNumber, balance, owner, "Savings");
        this.interest = interest;
    }

    public void compoundInterest() {
        balance += (balance * ((float) interest / 100.0));
    }

    @Override
    public void withdraw(int amt) {
        setTxCount();
        super.withdraw(amt);
    }

    public void resetMonthlyTxCount() {
        txCount = 0;
    }

    public void setTxCount() {
        txCount++;
    }

}
