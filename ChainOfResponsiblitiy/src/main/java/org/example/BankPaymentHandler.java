package org.example;

public class BankPaymentHandler extends PaymenHandler {
    @Override
    public void handlepayment(double amt) {
        if(amt < 500){
            System.out.println("Paid using bank account: $" + amt);
        }else{
            next.handlepayment(amt);
        }
    }
}
