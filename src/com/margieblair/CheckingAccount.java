package com.margieblair;

public class CheckingAccount extends BankAccount {
    private boolean hasDebitCard;
//    private int txCount;

    public CheckingAccount(int accountNumber, int balance, String owner, boolean hasDebitCard) {
        super(accountNumber, balance, owner, "Checking");
        this.hasDebitCard = hasDebitCard;
    }



//    public void incrementTxCount() {
//        txCount++;
//    }
}
