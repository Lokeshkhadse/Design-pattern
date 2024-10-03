package example;

public class CreditCardAdapter implements PaymentProcessor{

       private  CreditCard creditCard;
        public CreditCardAdapter(){
            creditCard = new CreditCard();
        }

    @Override
    public void paymentprocess(double amount) {
            creditCard.creditpayment(amount);

    }
}
