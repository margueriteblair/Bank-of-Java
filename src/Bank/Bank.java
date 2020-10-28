package Bank;

import Account.Account;
import Account.BankAccount;
import Account.*;

import java.util.HashMap;

public class Bank {
    private String name;
    private int safeAmt;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    public Bank(String name) {
        this.name = name;
        clients = new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        //get a client, and add it to that client
        //also add the account to the banks account list
        //create account and give it to the client
        accounts.put(account.getAccountNumber(), account);
    }

    public Account createAccount(int acctNumber, int initialBalance, Client owner, String acctType) {
        switch (acctType) {
            case "Checking" :
                Account account = new CheckingAccount(acctNumber, initialBalance, owner, "Checking");
                return account;
                break;
            case "Savings" :
                Account account = new SavingsAccount(acctNumber, initialBalance, owner, "Savings");
                return account;
            break;
        }
    }

    //at minimum:

//    public SavingsAccount createSavingsAccount() {}
//    public CheckingAccount createCheckingAccount() {}
}
