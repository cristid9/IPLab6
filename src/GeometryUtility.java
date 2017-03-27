
public class GeometryUtility {
    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt( p1.getX() * p1.getX() + p2.getY() * p2.getY());
    }
}
