import heritage.Rectangle;
import heritage.Shape;
import zoo.Car;

public abstract class Data {


    public static void start() {
        // casting - down and up
        Shape s = new Rectangle(5, 6);
        Rectangle r = new Rectangle(2, 4);

        r.getWidth();  // regular
        ((Rectangle) s).getWidth();  // downcasting
        s.getColor();  // regular
        r.getColor(); // upcasting -> no need for casting



        // Composition - part of - strong connection
        // Aggregation - has a   - weak connection
        // Engine in car
        /*
        Engine eng = new Engine()
        Car car = new Car();

        car.setEngine(eng);
        car = null;
        engine still live -> Aggregation - has a

        car.setEngine(new Engine())
        car = null
        engine also died -> Composition - part of

         */


        // Overloading
        // add(int a, int b)
        // add(double a, double b)
        // add(double a, int b)
        // add(int a, double b)


        // Override
        // take the toString of the child


        // Data Member - fields - class parameters - > this.

        // By value / By reference
        int x = 5; // int double long short byte float boolean char.
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Car car = new Car("fd", 12);

        foo(x);
        foo(arr);
        foo(car);



        // JVM
        /*
        our code -> compiler change it to bytecode  (.class)
        JVM reads the bytecode -> machine language

        JVM - memory management
        Heap - dynamic
        Stack - functions and local params
        Garbage Collector


         */



    }

    private static void foo(int num) {
        // By value
        num = 9;
    }

    private static void foo(int[] arr) {
        // By reference
        arr[1] = 20;
    }

    private static void foo(Car car) {
        // By reference
        car = null;

        Human guy = new Human();
        guy.getAge();

        Human.getNumOfHumans();
    }


    static class Human {

        static int numOfHumans = 10_000_000;
        private int age;

        public int getAge() {
            return age;
        }

        public static int getNumOfHumans() {
            return numOfHumans;
        }
    }


    public static class Father {

    }
    public static class Num extends Father {
        int n;

        public Num(int n) {
            this.n = n;
        }
    }

    public static void main() {
        Num num = new Num(5);
        pow(num.n);
        pow(num);
        pow(num.n);
    }

    public static void pow(int n) {
        n = n * n;
        System.out.println("Result: " + n);
    }

    public static void pow(Num num) {
        num.n = num.n * num.n;
        System.out.println("Result: " + num.n);
    }

    /**
     * Result: 25
     * Result: 25
     */
}
