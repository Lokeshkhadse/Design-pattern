package example;

abstract class ToppingDecorator implements Pizza {
     protected Pizza pizza;

     public ToppingDecorator(Pizza pizza) {
         this.pizza = pizza;
     }

     @Override
     public String Description() {
         return pizza.Description();
     }

     @Override
     public double amount() {
         return pizza.amount();
     }
}
