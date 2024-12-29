package exercise1;

public class PC extends Computer {

    public PC(String name, double price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        System.out.println("Keyboard");
    }

    public PC(PC other) {
        super(other);
    }

    @Override
    public PC copy() {
        return new PC(this);
    }

    @Override
    public String toString() {
        return "PC: " + super.toString();
    }
}
