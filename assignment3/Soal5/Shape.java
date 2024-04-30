public class Shape {
    /*
      * Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
      * Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate thearea and perimeter of a circle.
      */

    protected double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }

}
