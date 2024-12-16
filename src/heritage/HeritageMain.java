package heritage;

public class HeritageMain {

    public static void start() {


        Square s1 = new Square("Black", 5);
        Triangle t1 = new Triangle("Black", 5, 7);
        Rectangle r1 = new Rectangle("Black", 5, 7);


        System.out.println(s1);
        System.out.println(t1.toString());
        System.out.println(r1.toString());
        System.out.println(Shape.getNumOfShapes());
    }

}
