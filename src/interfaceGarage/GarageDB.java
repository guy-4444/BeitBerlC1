package interfaceGarage;

import java.util.ArrayList;

public class GarageDB {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

}
