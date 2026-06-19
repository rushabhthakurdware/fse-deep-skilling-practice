public class GooglePayAdapter implements PaymentProcessor{
    private GooglePay googlePay;
    public GooglePayAdapter(GooglePay googlePay){
        this.googlePay = googlePay;
    }
    @Override
    public void processPayment(double amount){
        googlePay.senPayment(amount);
    }
}
