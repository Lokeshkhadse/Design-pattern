package example;

public class main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new CreditCardAdapter();
        paymentProcessor.paymentprocess(100.00);

        PaymentProcessor paymentProcessor1 = new PayPalAdapter();
        paymentProcessor1.paymentprocess(200.00);

    }
}
