package zoo;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate banana");
    }


    public void climb() {
        System.out.println(getName() + " - climb");
    }

    @Override
    public String toString() {
        return "Monkey:" + super.toString();
    }
}
