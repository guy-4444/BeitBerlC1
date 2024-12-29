package exercise1;

import java.util.ArrayList;

public class Buyer {

    private String name;
    private ArrayList<Product> products;

    public Buyer() {
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null  ||  name.equals("")) {
            name = "NA";
        }
        name = name.toLowerCase();
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public static double calculateSum(ArrayList<Product> products) {
        double sum = 0.0;

        for (Product product : products) {
            sum += product.getPrice();
        }

        return sum;
    }
}
