package com.margieblair;

public class Main {

    public static void main(String[] args) {

        CheckingAccount myChecking = new CheckingAccount(113134463, 3000, "Margie Blair, bitch!", true);
        SavingsAccount mySavings = new SavingsAccount(424244444, 100000, "Margie Blair, bitch!", 4, 0, 6);
        myChecking.deposit(400);
//        System.out.println(myChecking.getDetails());
//        myChecking.withdraw(1000000);
        //int accountNumber, int balance, String owner, String acctType
        System.out.println();
        mySavings.compoundInterest();
//        System.out.println(mySavings.getDetails());
    }
}
