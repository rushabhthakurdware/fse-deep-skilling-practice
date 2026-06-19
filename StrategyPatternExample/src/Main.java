//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678"));
        context.payAmount(5000);

        context.setStrategy(new PayPalPayment("user@gmail.com"));
        context.payAmount(3000);
    }
}