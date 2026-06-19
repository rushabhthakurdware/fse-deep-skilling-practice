public abstract class NotifierDecorator implements notifier{

    private notifier notifier;

    public NotifierDecorator(notifier notifier){
        this.notifier = notifier;
    }
    public void send(String message ){
        notifier.send(message);
    }
}
