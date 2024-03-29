abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract methods for deposit and withdrawal
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

// SavingsAccount class (subclass of Account)
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Override deposit method to calculate interest
    @Override
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        super.deposit(amount + interest);
        System.out.println("Interest of " + interest + " applied.");
    }

    // Override withdrawal method to ensure sufficient balance
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

// CurrentAccount class (subclass of Account)
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Override withdrawal method to check overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}

// BankingApplication class (Main)
public class Q7 {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        CurrentAccount currentAccount = new CurrentAccount("CA456", 2000.0, 500.0);

        // Test deposit and withdrawal operations
        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        System.out.println("Final Savings Account Balance: " + savingsAccount.getBalance());

        System.out.println("\nInitial Current Account Balance: " + currentAccount.getBalance());
        currentAccount.deposit(1000.0);
        currentAccount.withdraw(2500.0);
        System.out.println("Final Current Account Balance: " + currentAccount.getBalance());
    }
}