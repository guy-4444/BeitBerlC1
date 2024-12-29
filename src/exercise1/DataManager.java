package exercise1;

import java.util.HashMap;

public class DataManager {

    public static HashMap<Integer, Product> mockProducts() {
        HashMap<Integer, Product> productMap = new HashMap<>();

        productMap.put(1, new Smartphone("Samsung S23", 1000));
        productMap.put(2, new Smartphone("iPhone 16", 1200));
        productMap.put(3, new TV("LG 43", 400));
        productMap.put(4, new TV("LG 85", 1400));
        productMap.put(5, new Laptop("Asus ROG", 2200));
        productMap.put(6, new Laptop("Macbook Pro", 3300));
        productMap.put(7, new PC("Mac Studio", 5600));
        productMap.put(8, new PC("Dell", 3500));

        return productMap;
    }
}
