package exercise1;

public class GamingPC extends PC {

    private String GPU;

    public GamingPC(String name, double price) {
        super(name, price);
    }

    @Override
    public void warranty() {
        super.warranty();
        System.out.println("GPU");
    }

    @Override
    public String toString() {
        return "PC: " + super.toString();
    }

}
