package com.margieblair;

import java.util.*;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    private String cvv;
    private String cardOwner;
    private String cardNumber;
    private List<SavingsAccount> atmAccounts; //should actually make an interface

    public DebitCard(String cardNumber, String pin, String cvv, String cardOwner, CheckingAccount primary, List atmAccounts) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

    public boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }

}
