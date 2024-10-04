package org.example;

public class CreditCardHandler extends PaymenHandler{
    @Override
    public void handlepayment(double amt) {
        if (amt <= 1000) {
            System.out.println("Paid using credit card: $" + amt);
        } else {
            next.handlepayment(amt);
        }

    }
}
