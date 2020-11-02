package Account;

import Bank.Client;

public class CDInvestment extends InvestmentAccount {
    private String timePeriod = "Y";
    private int timeFrame;

    public CDInvestment(int balance, int accountNum, Client owner, int interestRate, int period, int timeFrame) {
        super(balance, accountNum, owner, interestRate, period, "M");
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
