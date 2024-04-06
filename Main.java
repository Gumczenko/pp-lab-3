public class Main {
    public static void main(String[] args) {
        Point center = new Point(1, 2);
        double radius = 4;

        Circle circle = new Circle(center, radius);

        System.out.println("wspolrzedne srodka " + circle.getCenter().getX() + " " + circle.getCenter().getY());
        System.out.println("promien " + circle.getRadius());
        System.out.println("obwod  " + circle.calculatePerimeter());
    }
}