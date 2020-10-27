package com.margieblair;

public class CDInvestment extends InvestmentAccount {
    //hello world
    private int timeFrame;
    private char timePeriod = 'Y';

    public CDInvestment(int balance, int accountNum, String owner, int interestRate, int period, int timeFrame) {
        super(balance, accountNum, owner, interestRate, period, 'M');
        this.timeFrame = timeFrame;
    }

    public void checkIfInterest(int time) {
        if (time >= timeFrame && balance > 0) {
            applyInterest();
        }
    }

    @Override
    public void withdraw(int amt) {
        return;
    }

}
