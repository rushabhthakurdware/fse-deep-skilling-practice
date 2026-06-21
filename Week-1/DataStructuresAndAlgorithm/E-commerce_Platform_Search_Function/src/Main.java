//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1,"apple","fruit");
        Product p2 = new Product(2,"Banana","fruit");
        AddItem ad = new AddItem();
        ad.addItem(p1);
        ad.addItem(p2);
        ad.linearSearch(2);

    }
}