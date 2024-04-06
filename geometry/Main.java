package geometry;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(1, 2), 3);
        circles[1] = new ColoredCircle(new Point(3, 4), 5, "blue");
        for (Circle circle : circles) {
            System.out.println("pole powierzchni " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("kolor " + coloredCircle.getColor());
            }
        }
    }
}