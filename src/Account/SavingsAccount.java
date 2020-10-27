package Account;


public class SavingsAccount extends BankAccount {
    private int interest;
    private int txLimit;
    private int txCount;

    public SavingsAccount(int accountNumber, int balance, String owner, int interest, int txCount, int txLimit) {
        super(accountNumber, balance, owner, "Savings");
        this.interest = interest;
        this.txCount = txCount;
        this.txLimit = txLimit;
    }

    public void compoundInterest() {
        balance += (balance * ((float) interest / 100.0));
    }

//    @Override
//    public void withdraw(int amt) {
//        incrementTxCount();
//        if (txCount > txLimit) {
//            System.out.println("Transaction limit reached for savings account! Try again next month.");
//            return;
//        }
//        super.withdraw(amt);
//    }

//    public void resetMonthlyTxCount() {
//        txCount = 0;
//    }

    public void incrementTxCount() {
        txCount++;
    }

    public void setTxCount(int newTxCount) {
        txCount = newTxCount;
    }

}
