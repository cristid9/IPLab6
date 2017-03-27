public class Square extends AbstractPolygonal {


    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (ISides s : sides) {
            perimeter += s.getDistance();
        }

        return perimeter;
    }

    @Override
    public double getArea() {
        return 1; // dummy
    }

    @Override
    public int getNumberOfSides() {
        return sides.size();
    }

    @Override
    public String draw() {
        return "Square";
    }
}
