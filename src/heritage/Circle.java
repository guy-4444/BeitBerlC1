package heritage;

public class Circle {

    private String color = "White";
    private double radius = 0.0;

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(String color, double radius) {
        setColor(color);
        setRadius(radius);
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        if (color == null  ||  color.equals("")) {
            return;
        }
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0.0) {
            return;
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
