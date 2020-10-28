package Bank;

import Bank.*;
import Account.*;

import BankTools.DebitCard;

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
    private Account linkedAccount;
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
            for (var acct : accounts) {
                if (acct.getAccountNumber() == accountNum) {
                    linkedAccount = acct;
                }
            }
            DebitCard newCard = new DebitCard("000000000", "4444", "000", "Margie Blair", (CheckingAccount) linkedAccount);
        }

//     }



}
