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
    private List<DebitCard> debitCards;
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
        accounts = new ArrayList<>(); //it'll call the data type from the already defined list
        debitCards = new ArrayList<>();
     }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public void addDebitCard(int accountNum) {
        //we need to take the accountNumber we pass in, and use that to match
            //the accountNum from the accounts ArrayList
            //can't use .indexOf() on objects
            //THINK MARGIE HOW DO WE PULL THE ACCOUNT NUMBER
            //FROM THE ACCOUNT LIST
            DebitCard newCard = new DebitCard();
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
