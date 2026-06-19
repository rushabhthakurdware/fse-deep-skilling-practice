//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessor pp = new GooglePayAdapter(new GooglePay());
        pp.processPayment(2000);

        pp = new PayPalAdapter(new Paypal());
        pp.processPayment(3000);

        pp = new PhonePayAdapter(new PhonePay());
        pp.processPayment(4000);
    }
}