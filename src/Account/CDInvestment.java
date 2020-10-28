package Account;

import Account.InvestmentAccount;
import Bank.*;

public class CDInvestment extends InvestmentAccount {
    //hello world
    private int timeFrame;

    public CDInvestment(int balance, int accountNum, Client owner, int interestRate, int period, int timeFrame) {
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
