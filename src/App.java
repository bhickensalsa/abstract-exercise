public class App {
    public static void main(String[] args) throws Exception {
        CurrentAccount account1 = new CurrentAccount("Hugo", 0);
        SavingsAccount account2 = new SavingsAccount("Kony", 52.0);
        account1.printBalance();
        account2.printBalance();
        account1.deposit(200.0);
        account2.withdraw(50.0);
        account1.printBalance();
        account2.printBalance();
        account2.withdraw(1000);
    }
}
