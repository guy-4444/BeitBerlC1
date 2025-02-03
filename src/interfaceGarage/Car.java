package interfaceGarage;

public class Car extends Vehicle {

    private static final int NUM_OF_WHEELS = 4;

    public Car(String model) {
        super(model);
    }

    @Override
    public int getFixedTime() {
        return 5;
    }

    @Override
    public void fixed() {
        System.out.println("Car (" + getModel() + ") is fixed - " + NUM_OF_WHEELS + " wheels");
    }
}
