package example;

public class PayPalAdapter implements PaymentProcessor{

    private PayPal payPal;

    public PayPalAdapter(){
        payPal = new PayPal();
    }
    @Override
    public void paymentprocess(double amount) {
      payPal.PayPalPayment(amount);
    }
}
