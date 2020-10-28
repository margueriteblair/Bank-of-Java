package Bank;

import Account.Account;
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

    public void addAccount(Account account, Client client) {
        //TODO: get client
        //TODO: create account and give it to client
        accounts.put(account.getAccountNumber(), account);
        client.addAccount(account);
    }

    public Account createAccount(int acctNumber, int initialBalance, Client owner, String acctType, int interest, int txLimit) {
        switch (acctType) {
            case "Checking" :
                return new CheckingAccount(acctNumber, initialBalance, owner);
            case "Savings" :
                return new SavingsAccount(acctNumber, initialBalance, owner, interest, txLimit);
            default: return new BankAccount(acctNumber, initialBalance, owner, acctType);
        }
    }

}
