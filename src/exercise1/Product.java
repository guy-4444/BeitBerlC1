package exercise1;

public abstract class Product {

    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product other) {
        this.name = other.name;
        this.price = other.price;
    }

    public abstract void warranty();
    public abstract Product copy();

    public double calculateVAT() {
        return price / 1.17 * 0.17;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
