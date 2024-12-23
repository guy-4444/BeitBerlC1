package zoo;

public class Deer extends Animal implements Moveable {

    public Deer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate grass");
    }

    public void jump() {
        System.out.println(getName() + " - jump");
    }

    @Override
    public String toString() {
        return "Deer:" + super.toString();
    }

    @Override
    public void move() {
        System.out.println("Deer - step step");
    }
}
