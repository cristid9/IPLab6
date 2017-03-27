public abstract class AbstractCircular implements  ICircularShape {

    double ray;
    double circumference;

    @Override
    public int getNumberOfSides() {
        return 1;
    }
}
