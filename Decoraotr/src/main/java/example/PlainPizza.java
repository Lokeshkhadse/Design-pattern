package example;

public class PlainPizza implements Pizza {
    @Override
    public String Description() {
        return "Basic pizza";
    }

    @Override
    public double amount() {
        return 60.00;
    }
}
