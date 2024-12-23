package zoo;

import java.util.ArrayList;
import java.util.Objects;

public class ZooMain {

    public static void start() {


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Mufasa", 20));
        animals.add(new Lion("Simba", 10));
        animals.add(new Deer("Bambi", 5));
        animals.add(new Lion("Scar", 35));
        animals.add(new Monkey("Kofiko", 35));
        animals.add(new Monkey("Bobo", 25));
        animals.add(new Eagle("Zazzoo", 25));

        //animalActions(animals);


        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("11-222-33", 100_000));
        vehicles.add(new Car("33-222-11", 200_000));
        vehicles.add(new Plane("AF3434", 10_000_000));
        vehicles.add(new Submarine("fg44", 70_000));


        for (Animal animal : animals) {
            //animal.eat();
        }


        ArrayList<Object> objects = new ArrayList<>();
        for (Animal animal : animals) {
            objects.add(animal);
        }
        for (Vehicle vehicle : vehicles) {
            objects.add(vehicle);
        }

        for (Object object : objects) {
            System.out.println(object.toString());

            if (object instanceof Moveable) {
                Moveable moveable = (Moveable) object;
                moveable.move();
            }

            if (object instanceof Flyable) {
                Flyable flyable = (Flyable) object;
                flyable.takeoff();
                flyable.fly();
                flyable.land();
            }
        }



        Car c1 = new Car("324432", 500);
        Vehicle c2 = new Car("324432", 500);
        Moveable c3 = new Car("324432", 500);
    }

    private static void animalActions(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Lion) {
                ((Lion) animal).run();
            } else if (animal instanceof Deer) {
                ((Deer) animal).jump();
            } else if (animal instanceof Monkey) {
                ((Monkey) animal).climb();
            }
        }
    }

}
