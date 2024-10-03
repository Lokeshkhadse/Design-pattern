package org.example;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String Description() {
        return coffee.Description() + ", with Milk";
    }

    @Override
    public double amount() {
        return coffee.amount() + 10.50; // Adding cost for milk
    }


}
