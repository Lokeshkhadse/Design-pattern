package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.Description() + " $" +  coffee.amount());


        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.Description() + " $" + coffee.amount());

        // Adding Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.Description() + " $" + coffee.amount());

    }
}