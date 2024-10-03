package example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        // Add extra cheese
        pizza = new CheeseDecorator(pizza);


        // Add pepperoni
        pizza = new PepperoniDecorator(pizza);

        // Output the description and cost
        System.out.println(pizza.Description() + " costs $" + pizza.amount());
    }
}
