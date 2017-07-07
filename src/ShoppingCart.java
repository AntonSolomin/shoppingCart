import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    ArrayList<Product> products = new ArrayList<Product>(6);

    ShoppingCart () {

        }

    void addProduct(Product product) {
            products.add(product);
        }

    @Override
    public String toString() {
        return products.toString();
        // super lets you use methods of the parent
        // return super.toString();
    }

    public String totalPrice() {
            int total = 0;
            String message = "Your total is: ";
            String messageSets = "";
            HashMap<String, Integer> count = new HashMap<>();
            HashMap<String, Integer> price = new HashMap<>();
            //Calculating the total price that will be changed later on
            for (int i = 0; i < products.size(); i++) {
                total += products.get(i).price;
            }
            // 5 items or more discount
            if (products.size() >= 5) {
                total = total - total/10;
                message = "Total Price with the 10% discount is: ";
            }
            // creating a hashtable and counting the elemetns from
            // the newly created hashtable
            for (int i=0; i < products.size(); i++) {
                if (count.get(products.get(i).name) == null) {
                    count.put(products.get(i).name, 1);
                    price.put(products.get(i).name, products.get(i).price);
                } else {
                    String name = products.get(i).name;
                    int value = count.get(name);
                    count.put(products.get(i).name, value + 1);
                }
            }

            //subtracting the necessary amount from the total if the count if 4 or more
            for (String key : count.keySet()) {
                if (count.get(key) >= 4){
                    int set = count.get(key)/4;
                    // get() is get me the value assigned(related) to this key
                    total -= price.get(key)*set;
                    messageSets += "You are buying " + count.get(key) + " items of "
                            + key + ". It means" + " you are getting " + set +
                            " for free! " + System.getProperty("line.separator");
                }
            }


            return messageSets + message + total;
        }

    public void replace(String oldProductName, Product newProductName ) {
        for (int i = 0; i< products.size(); i++ ) {
            if (oldProductName == products.get(i).name) {
                System.out.println("Found: " + products.get(i).name);

                //set replaces the existing index with what you need;
                products.set(i, newProductName);
                System.out.println("Replaced: " + products.get(i).name);
            }
        }
    }
}
