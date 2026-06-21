//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product pd1= new Product(1 , "apple",2,15);
        Product pd2 = new Product(2 , "banana",1,10);
        Inventory in = new Inventory();
        in.addProduct(pd1);
        in.addProduct(pd2);

        in.viewProduct(1);
        in.deleteById(1);
        in.viewProduct(1);

    }
}