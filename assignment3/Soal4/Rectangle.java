public class Rectangle extends Shape {
    private double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height;
    }
}
