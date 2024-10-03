package example;

public class PepperoniDecorator  extends ToppingDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String Description() {
        return pizza.Description() + ", with Pepperoni";
    }

    @Override
    public double amount() {
        return pizza.amount() + 50.00; // Additional cost for pepperoni
    }
}

