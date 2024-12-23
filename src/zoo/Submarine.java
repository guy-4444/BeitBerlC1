package zoo;

public class Submarine extends Vehicle {

    public Submarine(String license, int km) {
        super(license, km);
    }

    @Override
    public String toString() {
        return "Submarine:" + super.toString();
    }

}
