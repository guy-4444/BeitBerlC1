package interfaceGarage;

public class Truck extends Vehicle {

    private static final int NUM_OF_WHEELS = 6;

    public Truck(String model) {
        super(model);
    }

    @Override
    public int getFixedTime() {
        return 10;
    }

    @Override
    public void fixed() {
        System.out.println("Truck (" + getModel() + ") is fixed - " + NUM_OF_WHEELS + " wheels");
    }
}
