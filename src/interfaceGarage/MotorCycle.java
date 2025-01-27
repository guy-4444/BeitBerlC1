package interfaceGarage;

public class MotorCycle extends Vehicle {

    private static final int NUM_OF_WHEELS = 2;

    public MotorCycle(String model) {
        super(model);
    }

    @Override
    public int getFixedTime() {
        return 3;
    }

    @Override
    public void fixed() {
        System.out.println("MotorCycle (" + getModel() + ") is fixed - " + NUM_OF_WHEELS + " wheels");
    }

    public static MotorCycle build(String model) {
        // return new motorcycle
        return null;
    }
}
