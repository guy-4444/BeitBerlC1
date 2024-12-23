package zoo;

public class Shark extends Animal {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate fish");
    }

    @Override
    public String toString() {
        return "Shark:" + super.toString();
    }
}
