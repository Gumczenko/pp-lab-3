package geometry;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
