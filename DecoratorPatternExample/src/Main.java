//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        notifier email = new EmailNotifier();
        email.send("hello from email");

        notifier emailSms = new SMSNotifierDecorator(new EmailNotifier());
        emailSms.send("message user ");

        notifier all = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        all.send("hello from all");
    }
}