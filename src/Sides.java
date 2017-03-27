import java.util.ArrayList;
import java.util.List;

public class Sides implements ISides {
    List<Point> points;

    public Sides() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public List<Point> getPoints() {
        return points;
    }

    public double getDistance() {
        return GeometryUtility.getDistance(points.get(0), points.get(1));
    }
}
