package heritage;

public abstract class Shape {

    private static int NUM_OF_SHAPES = 0;

    private String color = "White";

    public Shape() {
        NUM_OF_SHAPES++;
    }

    public Shape(String color) {
        NUM_OF_SHAPES++;
        setColor(color);
    }

    public abstract double getArea();

    public String getColor() {
        System.out.println("Shape getColor");
        return color;
    }

    protected void setColor(String color) {
        if (color == null  ||  color.equals("")) {
            return;
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return " [" +
                "color=" + color +
                ", area=" + getArea() + "]";
    }

    public static int getNumOfShapes() {
        return NUM_OF_SHAPES;
    }
}
