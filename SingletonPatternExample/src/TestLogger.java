public class TestLogger {
    public static void main(String[]args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("abc");
        logger2.log("def");

        if(logger1 == logger2){
            System.out.println("same instance ");
        }else{
            System.out.println("Different instances created");

        }
    }

}
