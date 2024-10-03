package example;

public class CheeseDecorator extends ToppingDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String Description() {
        return pizza.Description() + ", with Extra Cheese";
    }

    @Override
    public double amount() {
        return pizza.amount() + 20.00; // Additional cost for cheese
    }
}

