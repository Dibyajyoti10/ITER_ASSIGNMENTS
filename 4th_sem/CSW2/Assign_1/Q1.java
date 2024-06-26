//Q1. Write a program to create a bank account application and perform basic
//operations like withdraw and deposit.
//Note:
//– In the above question explain how to design the problem using objectoriented approaches.
//– In the design part pictorially represent to class Account and BankApp
//and the respective variable and methods
//– Explain encapsulation by making data member private and member
//functions public
//– Use the set, and get methods
//– Explain how to override the toString method with proper annotation.
//– Then implement it using Java


package Assign_1;

class account {
    private double balance;
    public account(double balance) {
        balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance +amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance -amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Q1 {
    public static void main(String[] args) {
        account acc = new account(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);
    }
}

//output:
//500.0 deposited successfully.
//200.0 withdrawn successfully.
//Insufficient funds or invalid amount for withdrawal.
