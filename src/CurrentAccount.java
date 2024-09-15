public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountUserName, double balance) {
        super(accountUserName, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("====================");
            System.out.println("Withdrew " + amount + "KR from " + this.accountUserName + "'s account ---- New balance: " + balance + " KR");
        } else {
            System.out.println("====================");
            System.out.println("Insufficient funds.");
        }
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public void printBalance() {
        System.out.println("====================");
        System.out.println("Account holder: " + this.accountUserName);
        System.out.println("Your balance is: " + this.getBalance());
        System.out.println("====================");
    }
}