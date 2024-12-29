package exercise1;

public class TV extends Product {


    public TV(TV other) {
        super(other);
    }

    @Override
    public TV copy() {
        return new TV(this);
    }

    public TV(String name, double price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        System.out.println("Screen");
    }

    @Override
    public String toString() {
        return "TV: " + super.toString();
    }
}
