public class Logger {
    private static Logger instance;

    public  Logger(){
        System.out.println("logger instance created");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }

}
