public class PayPalAdapter implements PaymentProcessor{
    private Paypal payPal;

    public PayPalAdapter(Paypal paypal) {
        this.payPal = paypal;
    }
    @Override
    public void processPayment(double amount){
        payPal.senPayment(amount);
    }
}
