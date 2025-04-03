import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber; 
    
    private static int accounts = 0;
    private static double totalMoney = 0;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();  
        accounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String getAccountNumber() {  
        return accountNumber;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equalsIgnoreCase("checking")) {
                checkingBalance += amount;
                totalMoney += amount;
            } else if (accountType.equalsIgnoreCase("savings")) {
                savingsBalance += amount;
                totalMoney += amount;
            }
        }
    }

    public void withdraw(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equalsIgnoreCase("checking") && checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else if (accountType.equalsIgnoreCase("savings") && savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds or invalid account type!");
            }
        }
    }

    public void getBalance() {
        System.out.println("Account #" + accountNumber + ":");
        System.out.println("Checking Balance: $" + String.format("%.2f", checkingBalance));
        System.out.println("Savings Balance: $" + String.format("%.2f", savingsBalance));
        System.out.println("Total Balance: $" + String.format("%.2f", (checkingBalance + savingsBalance)));
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNum = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNum.append(rand.nextInt(10));
        }
        return accountNum.toString();
    }
}