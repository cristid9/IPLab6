import java.util.ArrayList;
import java.util.List;

public class Rectangle extends AbstractPolygonal {

    public Rectangle() {
        sides = new ArrayList<>();
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (ISides s : sides) {
            perimeter += s.getDistance();
        }

        return perimeter * 2;
    }

    @Override
    public double getArea() {
        return sides.get(0).getDistance() * sides.get(1).getDistance();
    }

    @Override
    public int getNumberOfSides() {
        return sides.size();
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
