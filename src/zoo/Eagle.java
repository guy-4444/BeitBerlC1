package zoo;

public class Eagle extends Animal implements Flyable, Moveable {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate snake");
    }

    @Override
    public String toString() {
        return "Eagle:" + super.toString();
    }

    @Override
    public void takeoff() {
        System.out.println("Eagle - Whoshhh");
    }

    @Override
    public void land() {
        System.out.println("Eagle - Arggd");
    }

    @Override
    public void fly() {
        System.out.println("Eagle - eeeeee");
    }

    @Override
    public void move() {
        System.out.println("Eagle - kakaka");
    }
}
