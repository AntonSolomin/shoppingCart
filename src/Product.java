/**
 * Created by Anton on 06.07.2017.
 */
public class Product {
    String name;
    int price;
    Product(String productName, int productPrice ) {
        name = productName;
        price = productPrice;
    }

    public String toString() {
        return name + " " + price + ". ";
    }
}
