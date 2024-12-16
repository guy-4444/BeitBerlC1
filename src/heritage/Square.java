package heritage;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public Square(String color, double length) {
        super(color, length, length);
    }
}
