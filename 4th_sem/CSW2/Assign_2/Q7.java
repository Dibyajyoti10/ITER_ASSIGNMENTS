// Q7. Consider a scenario where you are tasked with developing a simple banking application 
// using Java, employing the concept of polymorphism. Your application should consist of three 
// classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the 
// base class with private attributes for account number and balance, along with abstract methods 
// for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include 
// an additional attribute for interest rate and override the deposit method to calculate interest, as 
// well as override the withdrawal method to ensure a sufficient balance. Similarly, the 
// CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit 
// attribute and override the withdrawal method to check the overdraft limit. Implement the 
// classes as described, ensuring proper encapsulation and abstraction. Finally, create a 
// BankingApplication class (Main) to demonstrate the polymorphic behavior by creating 
// instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal 
// operations, and displaying account details


package Assign_2;
abstract class Account{
    private String accNum;
    private int balance;

    Account(int balance){
        this.balance=balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    abstract void deposit();
    abstract void withdrawal();
}
class SavingsAccount extends Account{
    SavingsAccount(int balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

    int intRate;
    public void setIntRate(int intRate) {
        this.intRate = intRate;
    }

    @Override
    void deposit() {
        int interest = getBalance()*intRate/100;
        // TODO Auto-generated method stub
       System.out.println("The interest deposited is: "+interest);
    }

    @Override
    void withdrawal() {
        // TODO Auto-generated method stub
        System.out.println("The  withdrawl amount is: "+ intRate);
    }
    
}
class CurrentAccount extends Account{
    CurrentAccount(int balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }
    int overdraftLimit;
    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void deposit() {
        // TODO Auto-generated method stub
       int interest=getBalance()*overdraftLimit;
       System.out.println("The amount deposited is: "+ interest);
    }
    @Override
    void withdrawal() {
        // TODO Auto-generated method stub
       System.out.println("The withdrawl amount is: "+overdraftLimit);
    }
}
public class Q7 {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(0);
        CurrentAccount c=new CurrentAccount(0);
        s.setBalance(20000);
        s.setIntRate(5);
        c.setBalance(580000);
        c.setOverdraftLimit(10);
        s.deposit();
        s.withdrawal();
        c.deposit();
        c.withdrawal();
    }
}


// output
// The interest deposited is: 1000
// The  withdrawl amount is: 5
// The amount deposited is: 5800000
// The withdrawl amount is: 10