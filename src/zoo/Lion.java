package zoo;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate strawberry");
    }

    public void run() {
        System.out.println(getName() + " - run");
    }

    @Override
    public String toString() {
        return "Lion:" + super.toString();
    }
}
