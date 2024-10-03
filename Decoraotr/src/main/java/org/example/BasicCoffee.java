package org.example;

public class BasicCoffee implements Coffee{
    @Override
    public String Description() {
        return "Basic Coffee";
    }

    @Override
    public double amount() {
        return 60.00;
    }
}
