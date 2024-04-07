import geometry.Point;
import geometry.circle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3, 5);
        circle circle = new circle(center, 5.0);

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.GetRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
    }
}