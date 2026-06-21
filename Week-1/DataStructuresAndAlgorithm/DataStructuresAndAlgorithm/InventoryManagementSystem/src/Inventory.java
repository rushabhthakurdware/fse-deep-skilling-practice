import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product){
        products.put(product.getProductId() , product);
        System.out.println("Product added");
    }

    public void updateProduct(int id, int quantity, double price){
        Product p = products.get(id);
        if(p!=null){
            p.setQuantity(quantity);
            p.setPrice(price);
        }
    }

    public void deleteById(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product removed");
        } else {
            System.out.println("Product not found!");
        }
    }

    public void viewProduct(int id){
        Product p = products.get(id);
            if(p!=null){
                System.out.println("Product name is :"+p.getProductName()
                        +"\n"+"product id is :"+p.getProductId()
                        +"\n"+"Quantity of th product is :"+p.getQuantity()+
                        "\n"+"price of the product is :"+p.getPrice());
            }else{
                System.out.println("product not found");
            }
        }


}
