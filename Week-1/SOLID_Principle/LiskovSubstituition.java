//Objects of a superclass should be replaceable with objects of a
// subclass without breaking the program.

//If Shape s = new Rectangle(); works, then
//Shape s = new Square(); should also work without unexpected behavior.
//public class LiskovSubstituition {
//    double height,width;
//

//
//    public void setHeight(double height){
//        this.height = height;
//    }
//    public void setWidth(double width){
//        this.width = width;
//    }
//    public double getArea(){
//        return height * width;
//    }
//
//}
//class Square extends LiskovSubstituition{
//
//    @Override
//    public void setWidth(double width){
//        this.width = width;
////        this.height = width;
//    }
//
//    @Override
//    public void setHeight(double height){
//        this.height = height;
////        this.width = height;
//    }
//}
//
//class Main2 {
//    public static void main(String[] args) {
//        LiskovSubstituition r = new Square();
//        LiskovSubstituition r1 = new LiskovSubstituition();
//
//
//        r.setWidth(5);
//        r.setHeight(10);
////        System.out.println(r1.getArea());
//        System.out.println(r.getArea());
//    }
//}

interface Shape1 {
    int getArea();
}

class Rectangle1 implements Shape1 {
    private int width, height;

    Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
class Square1 implements Shape1 {
    private int side;

    Square1(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

class Main1 {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle1(5, 10);
        Shape1 s2 = new Square1(5);

        System.out.println(s1.getArea()); // 50
        System.out.println(s2.getArea()); // 25
    }
}