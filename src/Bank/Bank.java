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

    public void addAccount(Account account, String clientId) {
        //TODO: get client
        //TODO: create account and give it to client
        accounts.put(account.getAccountNumber(), account);
        for (Client client : clients.values()) {
            if (client.getClientId() == clientId) {
                client.addAccount(account);
            }
        }

    }

    public Account createAccount(int acctNumber, int initialBalance, Client owner, String acctType, int interest, int txLimit) {
        switch (acctType) {
            case "Checking" :
                return new CheckingAccount(acctNumber, initialBalance, owner);
            case "Savings" :
                return new SavingsAccount(acctNumber, initialBalance, owner, interest, txLimit);
            case "Investment" :
                return new InvestmentAccount(initialBalance, acctNumber, owner, interest, int period, char periodType);
            case "CD" :
                return new CDInvestment(acctNumber, initialBalance, owner, interest, int period, int timeFrame);
            default: return new BankAccount(acctNumber, initialBalance, owner, acctType);
        }
    }

}
