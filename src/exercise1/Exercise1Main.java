package exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1Main {

    static class AmazonException extends Exception {

        public AmazonException(String message) {
            super(message);
        }
    }

    static class AliException extends Exception {

        public AliException(String message) {
            super(message);
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<Integer, Product> productsMap;
    private static Buyer buyer = new Buyer();

    public static void start() {
        productsMap = DataManager.mockProducts();
        getOrder();
        getCoupon();
        printInvoice();

    }

    private static void getOrder() {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        buyer.setName(name);
        System.out.println("Hi " + name);


        while (true) {
            System.out.println("please choose product (serial number) (-1 to exit)");
            for (Map.Entry<Integer, Product> entry : productsMap.entrySet()) {
                int serial = entry.getKey();
                Product product = entry.getValue();
                System.out.println(serial + ". " + product);
            }
            int chosen = scanner.nextInt();
            System.out.println("chosen = " + chosen);

            if (chosen == -1) {
                break;
            }

            try {
                addProductToCart(chosen);
            } catch (AmazonException e) {
                System.out.println(e.getMessage());
//                System.out.println(" ! ! ! be careful with serial number ! ! ! ");
            }
        }
    }

    private static void addProductToCart(int chosenSerial) throws AmazonException {
        if (chosenSerial < 1) {
            throw new AmazonException("Illegal serial number - now low");
        } else if (chosenSerial > productsMap.size()) {
            throw new AmazonException("Illegal serial number - too high");
        }

        Product chosenProduct = productsMap.get(chosenSerial);
        Product copy = chosenProduct.copy();
        buyer.addProduct(copy);
    }

    private static void getCoupon() {
        scanner.nextLine();
        System.out.println("Please enter your coupon:");
        String coupon = scanner.nextLine();
        if (coupon.equals("HOLIDAY30")) {
            HashMap<String, Boolean> alreadyCouponed = new HashMap<>();

            for (Product product : buyer.getProducts()) {
                if (!alreadyCouponed.containsKey(product.getName())) {
                    product.setPrice(product.getPrice() * 0.7);
                    alreadyCouponed.put(product.getName(), false);
                }
            }
        }
    }

    private static void printInvoice() {
        System.out.println("\n ▧ ▧ ▧ ▧ Invoice ▧ ▧ ▧ ▧");
        System.out.println("=client: " + buyer.getName());
        System.out.println("");

        for (int i = 0; i < buyer.getProducts().size(); i++) {
            Product product = buyer.getProducts().get(i);
            System.out.println((i + 1) + ". " + product);
            System.out.print("Warranty: ");
            product.warranty();

            if (product instanceof Portable) {
                System.out.print("This product is portable, Weight: ");
                ((Portable) product).weight();
            }

            System.out.println("    - - - - ");

        }

        double sum = Buyer.calculateSum(buyer.getProducts());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n total: " + sum + " $");

    }
}
