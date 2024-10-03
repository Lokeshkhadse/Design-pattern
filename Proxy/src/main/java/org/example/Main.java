package org.example;
// it crete proxy object or reference object of existing objet and manage it
//example:- Bank ,real bank and Atm proxy through we can deposit,check balance ,withdraw
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank atm = new AtmProxy(1000);

        // Perform deposit
        atm.Deposit(500); // Deposits $500

        // Perform withdrawal
        atm.withdraw(200); // Withdraws $200

        // Check balance
        double balance = atm.checkBalance();
        System.out.println("Current Balance: $" + balance);
    }
    }
