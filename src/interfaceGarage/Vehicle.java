package interfaceGarage;

public abstract class Vehicle implements Fixable {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract int getFixedTime();


}
