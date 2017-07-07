import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {

        //creating products
        Product product1 = new Product("Banana", 10);
        Product product2 = new Product("Apple", 7);
        Product product3 = new Product("Pear", 3);
        Product product4 = new Product("avocado", 5);
        Product product5 = new Product("mango", 1);
        Product product6 = new Product("lime", 2);

        //initiating Shopping Cart and Adding stuff to the shopping cart
        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product1);
        myShoppingCart.addProduct(product2);
        myShoppingCart.addProduct(product2);
        myShoppingCart.addProduct(product2);
        myShoppingCart.addProduct(product2);
        /*myShoppingCart.addProduct(product3);
        myShoppingCart.addProduct(product4);
        myShoppingCart.addProduct(product5);
        myShoppingCart.addProduct(product6);*/


        System.out.println(myShoppingCart.totalPrice());
    }
}
