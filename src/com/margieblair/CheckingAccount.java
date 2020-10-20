package com.margieblair;

public class CheckingAccount extends BankAccount {
    private boolean hasDebitCard;
    private int txCount;

    public CheckingAccount(int accountNumber, int balance, String owner, boolean hasDebitCard) {
        super(accountNumber, balance, owner, "Checking");
        this.hasDebitCard = hasDebitCard;
    }

    public int showTxCount() {
        System.out.println("Your current amount of checking account transactions is: " + txCount);
        return txCount;
    }

    @Override
    public void withdraw(int amt) {
        txCount++;
        super.withdraw(amt);
    }

    //    public void incrementTxCount() {
//        txCount++;
//    }
}
