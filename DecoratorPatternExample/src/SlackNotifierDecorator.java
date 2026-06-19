public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
