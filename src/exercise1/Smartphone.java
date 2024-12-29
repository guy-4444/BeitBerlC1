package exercise1;

public class Smartphone extends Product implements Portable {

    public Smartphone(String name, double price) {
        super(name, price);
    }

    public Smartphone(Smartphone other) {
        super(other);
    }

    @Override
    public Smartphone copy() {
        return new Smartphone(this);
    }

    @Override
    public void warranty() {
        System.out.println("TouchScreen");
    }

    @Override
    public void weight() {
        System.out.println("200 gr");
    }

    @Override
    public String toString() {
        return "Smartphone: " + super.toString();
    }

}
