package Account;

public interface Account {
    //everything inside of an interface will either be public or final
    //we're setting up a contract
    //our classes that implement this must have these methods
    public void withdraw(int amt);
    public void deposit(int amt);
    public String getOwner();
    public String getDetails();
    public int getBalance();
    public int getAccountNumber();
}
