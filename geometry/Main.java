package geometry;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(1, 2);
        double radius = 4;
        String color = "Red"; // Kolor dla przykładu

        ColoredCircle coloredCircle = new ColoredCircle(center, radius, color);

        System.out.println("Współrzędne środka: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień: " + coloredCircle.getRadius());
        System.out.println("Kolor: " + coloredCircle.getColor());
        System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
    }
}