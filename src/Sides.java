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
}
