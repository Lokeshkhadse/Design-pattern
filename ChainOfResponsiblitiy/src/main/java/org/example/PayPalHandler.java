package org.example;

public class PayPalHandler extends PaymenHandler{
    @Override
    public void handlepayment(double amt) {
        if (amt <= 1500) {
            System.out.println("Paid using PayPal: $" + amt);
        } else {
            next.handlepayment(amt);
        }

    }
}
