public class EmailNotifier implements notifier{


    @Override
    public void send(String message){
        System.out.println("Sending Email: " + message);

    }
}
