package zoo;

public class Car extends Vehicle implements Moveable {

    public Car(String license, int km) {
        super(license, km);
    }

    @Override
    public String toString() {
        return "Car:" + super.toString();
    }

    @Override
    public void move() {
        System.out.println("Car - vhoom vhoom");
    }
}
