interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

public class interfaceSegregation implements Worker{
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        throw new UnsupportedOperationException("robot doesn't eat");
    }
}

//interface Workable {
//    void work();
//}
//
//interface Eatable {
//    void eat();
//}
//
//class HumanWorker implements Workable, Eatable {
//    public void work() {
//        System.out.println("Human working");
//    }
//
//    public void eat() {
//        System.out.println("Human eating");
//    }
//}
//
//class RobotWorker implements Workable {
//    public void work() {
//        System.out.println("Robot working");
//    }
//}