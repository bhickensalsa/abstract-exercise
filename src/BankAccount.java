public abstract class BankAccount {

    protected String accountUserName;
    protected double withdraw;
    protected double deposit;
    protected double balance;
    
    public BankAccount(String accountUserName, double balance) {
        this.accountUserName = accountUserName;
        this.balance = balance;
    }
    public abstract double getBalance();
    public abstract void printBalance();
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
}