//Not Following SRP rule

//public class SingleResponsibility {
//    String user;
//    String mail;
//
//    public SingleResponsibility(String user,String mail){
//        this.user = user;
//        this.mail = mail;
//    }
//
//    public void saveToDB(){
//        System.out.println(user+ "user stored in db");
//    }
//    public void sendMail(){
//        System.out.println("mailed at :"+mail);
//    }
//
//    public static void main(String[]args){
//        SingleResponsibility s = new SingleResponsibility("rushabh","r@gmail.com");
//        s.saveToDB();
//        s.sendMail();
//    }
//}

public class SingleResponsibility {
    private String user;
    private String mail;

    public SingleResponsibility(String user,String mail){
        this.user = user;
        this.mail = mail;
    }
    public String getUser(){
        return user;
    }
    public String getMail(){
        return mail;
    }


}
class userRepo{
    public void save(SingleResponsibility user){
        System.out.println(user.getUser() + "Saving user to database...");
    }
}

class EmailService {
    public void sendEmail(SingleResponsibility mail) {
        System.out.println("Sending email to " + mail.getMail());
    }
}

class main{
public static void main(String[]args){
    SingleResponsibility s = new SingleResponsibility("abc","abc@gmail");
    userRepo u = new userRepo();
    u.save(s);
    EmailService e = new EmailService();
    e.sendEmail(s);
}
}