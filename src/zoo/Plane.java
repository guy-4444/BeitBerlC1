package zoo;

public class Plane extends Vehicle implements Flyable {

    public Plane(String license, int km) {
        super(license, km);
    }

    @Override
    public String toString() {
        return "Plane:" + super.toString();
    }

    @Override
    public void takeoff() {
        System.out.println("Plane - Whoshhh");
    }

    @Override
    public void land() {
        System.out.println("Plane - Clapping");
    }

    @Override
    public void fly() {
        System.out.println("Plane - this is your captain");
    }
}
