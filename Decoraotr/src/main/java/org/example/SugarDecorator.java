package org.example;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String Description() {
        return coffee.Description() + ", with Sugar";
    }

    @Override
    public double amount() {
        return coffee.amount() + 5.00; // Adding cost for sugar
    }
}
