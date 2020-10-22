package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String firstname;
    private String lastName;
    private String middleName;
    private String clientId;
    private List<Account> accounts;
//    private List<CheckingAccount> checkingAccounts;
//    private List<SavingsAccount> savingsAccounts;
//    private List<CDInvestment> cdInvestments;

    public Client(String firstname, String lastName, String clientId) {
        this.name = firstname + " " + lastName;
        this.firstname = firstname;
        this.lastName = lastName;
        this.clientId = clientId;
//        this.checkingAccounts = new ArrayList<CheckingAccount>();
//        this.savingsAccounts = new ArrayList<SavingsAccount>();
//        this.cdInvestments = new ArrayList<CDInvestment>();
        this.accounts = new ArrayList<>(); //it'll call the data type from the already defined list
     }

        public void addAccount(Account account) {
            accounts.add(account);
        }
        //our bank is going to create the account

//     public void addAccount(CheckingAccount account) {
//        checkingAccounts.add(account);
//     }
//
//     public void addAccount(SavingsAccount account) {
//        savingsAccounts.add(account);
//     }
//
//     public void addAccount(CDInvestment account) {
//        cdInvestments.add(account);
//     }



}
