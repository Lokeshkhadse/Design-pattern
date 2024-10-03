package org.example;

 abstract class CoffeeDecorator implements Coffee{
     protected Coffee coffee;

     public CoffeeDecorator(Coffee coffee) {
         this.coffee = coffee;
     }

     @Override
     public String Description() {
         return coffee.Description();
     }

     @Override
     public double amount() {
         return coffee.amount();
     }
}
