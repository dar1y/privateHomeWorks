public class Rectangle implements MyShape {
    double sideA;
    double sideB;

    @Override
    public double area() {
        return sideB * sideA;
    }

    @Override
    public double perimeter() {
        return 2 * sideA + 2 * sideB;
    }
}
