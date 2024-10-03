package org.example;

public class RealBank implements Bank{

    private double balance;

    public  RealBank(double initialBalance){
      this.balance = initialBalance;
    }
    @Override
    public void Deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: $" + amount);
        }
    }


    @Override
    public double checkBalance() {
        return balance;
    }
}
