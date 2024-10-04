package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         PaymenHandler bank = new BankPaymentHandler();
         PaymenHandler credit = new CreditCardHandler();
         PaymenHandler paypal = new PayPalHandler();

        bank.setNext(credit);
        credit.setNext(paypal);

        bank.handlepayment(600);
        bank.handlepayment(200);
        bank.handlepayment(1200);
        bank.handlepayment(600);

    }
}