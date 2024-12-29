package exercise1;

public class Laptop extends Computer implements Portable {

    public Laptop(String name, double price) {
        super(name, price);
    }

    public Laptop(Laptop other) {
        super(other);
    }

    @Override
    public Laptop copy() {
        return new Laptop(this);
    }

    @Override
    public void warranty() {
        System.out.println("Charger");
    }

    @Override
    public double calculateVAT() {
        return getPrice() / 1.10 * 0.10;
    }

    @Override
    public void weight() {
        System.out.println("1.2 kg");
    }

    @Override
    public String toString() {
        return "Laptop: " + super.toString();
    }

}
