package com.margieblair;

public interface Account {
    //everything inside of an interface will either be public or final
    //we're setting up a contract
    public void withdraw(int amt);
    public void deposit(int amt);
    public String getOwner();
    public String getDetails();
    public int getBalance();
}
