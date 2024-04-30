public class Shape {
    /*
     * Write a Java program to create a class called Shape with a method called getArea(). 
     * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
     */

    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
