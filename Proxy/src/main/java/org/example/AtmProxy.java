package org.example;

public class AtmProxy implements Bank{

    private  RealBank realBank;

    public AtmProxy(double initialBalance){
        realBank= new RealBank(initialBalance);
    }
    @Override
    public void Deposit(double amount) {
        System.out.println("ATM processing deposit...");
        realBank.Deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ATM processing withdrawal...");
        realBank.withdraw(amount);
    }

    @Override
    public double checkBalance() {
        System.out.println("ATM retrieving balance...");
        return realBank.checkBalance();
    }

}
