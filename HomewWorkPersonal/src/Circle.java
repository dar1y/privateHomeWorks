public class Circle implements MyShape{
    double r;
    @Override
    public double area() {
        return r*r*Math.PI;
    }

    @Override
    public double perimeter() {
         return 2*Math.PI*r;
    }


}
