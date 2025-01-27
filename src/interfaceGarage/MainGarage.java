package interfaceGarage;

public class MainGarage {

    private static GarageDB garageDB;

    public static void start() {
        garageDB = new GarageDB();

        garageDB.addVehicle(new MotorCycle("Yamaha"));
        garageDB.addVehicle(new Car("Mercedes"));
        garageDB.addVehicle(new Car("Ferrari"));
        garageDB.addVehicle(new Truck("Isuzu"));



        Garage garage = new Garage(protocolGarage);
        garage.startWork(garageDB.getVehicles());
        //garage.startWork(map);
    }

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed() {
            System.out.println("another vehicle fixed $$");
        }
    };

    public void build(int type, String model) {
        //
    }
}
