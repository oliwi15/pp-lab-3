
import geometry.*;

public class Main {
    public static void main(String[] args) {

        Point center = new Point(3, 4);

        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");

        System.out.println(
                "Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.GetRadius());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }

}
