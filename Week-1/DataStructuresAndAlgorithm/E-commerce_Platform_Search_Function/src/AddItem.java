import java.util.ArrayList;
import java.util.List;

public class AddItem {
    List<Product>list = new ArrayList<>();
    public void addItem(Product p){
        list.add(p);
        System.out.println("Item added to the list");
    }

    public void linearSearch( int id){
        boolean found = false;
        for( Product p:list){
            if(p.getProductId() == id){
                System.out.println("product "+p.getProductName()+"is found with "+p.getProductId()+ " id");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("product not found");
        }
    }
}
