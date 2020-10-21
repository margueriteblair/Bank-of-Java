package com.margieblair;

import java.util.*;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    private String cvv;
    private String cardOwner;
    private String cardNumber;
    private List<SavingsAccount> atmAccounts; //should actually make an interface
}
