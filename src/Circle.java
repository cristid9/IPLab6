
public class Circle extends AbstractCircular {

    public Circle(double ray) {
        if (ray > 0) {
            this.ray = ray;
        } else {
            System.err.println("Radius of the circle should be greater than 0");
        }
    }

    private final double PI = 3.14159;

    @Override
    public double getPerimeter() {
        return 2 * PI * ray;
    }

    @Override
    public double getArea() {
        return PI * ray * ray;
    }

    @Override
    public String draw() {
        return "circle";
    }
}
