package Bank;

import Bank.*;
import Account.*;

import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Client {
    private String name;
    private String firstname;
    private String lastName;
    private String middleName;
    private String clientId;
    private HashMap<Integer, Account> accounts;
    private List<DebitCard> debitCards;
    private Account linkedAccount;


    public Client(String firstname, String lastName, String clientId) {
        this.name = firstname + " " + lastName;
        this.firstname = firstname;
        this.lastName = lastName;
        this.clientId = clientId;
        accounts = new HashMap<>();
        debitCards = new ArrayList<>();
     }

        public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        }

        public void addDebitCard(int accountNum) {
            for (var acct : accounts.values()) {
                if (acct.getAccountNumber() == accountNum) {
                    linkedAccount = acct;
                } else {
                    System.out.println("Invalid account");
                }
            }
        }




}
