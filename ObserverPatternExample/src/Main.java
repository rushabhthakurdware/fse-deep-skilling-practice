//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("User1");
        Observer web1 = new WebApp("User2");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        // Price changes
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(120.75);

        // Remove one observer
        stockMarket.removeObserver(mobile1);

        stockMarket.setStockPrice(140.00);
    }
}