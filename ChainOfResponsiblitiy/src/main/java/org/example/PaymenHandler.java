package org.example;

public abstract class PaymenHandler {
    protected  PaymenHandler next;

    public void setNext(PaymenHandler next){
        this.next = next;
    }

    public abstract void handlepayment(double amt);
}
