public class BankTest {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println("=== Deposit Tests ===");
        account1.deposit(100.50, "checking");
        account1.getBalance();
        System.out.println();

        account2.deposit(200.75, "savings");
        account2.getBalance();
        System.out.println();

        account3.deposit(50.25, "checking");
        account3.deposit(75.80, "savings");
        account3.getBalance();
        System.out.println();

        System.out.println("=== Withdrawal Tests ===");
        account1.withdraw(50.25, "checking");
        account1.getBalance();
        System.out.println();

        account2.withdraw(100.00, "savings");
        account2.getBalance();
        System.out.println();

        account3.withdraw(25.00, "checking");
        account3.getBalance();
        System.out.println();

        account1.withdraw(200.00, "checking"); 
        System.out.println();

        System.out.println("=== Static Tests ===");
        System.out.println("Total number of accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: $" + String.format("%.2f", BankAccount.getTotalMoney()));
    }
}