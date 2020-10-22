package com.margieblair;

public interface Account {
    public void withdraw(int amt);
    public void deposit(int amt);

    public String getDetails(int amt);
    public int getBalance();
}
