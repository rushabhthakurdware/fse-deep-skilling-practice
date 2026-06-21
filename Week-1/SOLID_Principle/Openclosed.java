//Bad habbit

//public class Openclosed{
//    public double calculateArea(Object shape){
//        if(shape instanceof Rectangle){
//            Rectangle r = (Rectangle)shape;
//            return r.length*r.width;
//        }else if(shape instanceof Circle){
//            Circle c = (Circle) shape;
//            return c.radius*c.radius;
//        }else{
//            return 0;
//        }
//    }
//}
//
//class Rectangle {
//    double length, width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//}
//
//class Circle {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//}
//class  main1{
//    public static void main(String []args){
//        Openclosed oc = new Openclosed();
//        Rectangle rc = new Rectangle(4,5);
//
//        System.out.println(oc.calculateArea(rc));
//        Circle c = new Circle(3);
//
//        System.out.println(oc.calculateArea(c));
//    }
//}

//Good Habbit

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius*radius;
    }

}
class main1{
    public static void main(String[]args){
        Shape s = new Circle(2);
        System.out.println(s.calculateArea());
        s = new Rectangle(4,5);
        System.out.println(s.calculateArea());
    }
}