import geometry.*;

public class Main {
    public static void main(String[] args) {
        circle[] circles = new circle[2];
        circles[0] = new circle(new Point(0, 0), 5.0);
        circles[1] = new ColoredCircle(new Point(2, 2), 3.0, "red");

        for (circle circle : circles) {
            double area = circle.GetArea();
            System.out.println("Pole koła: " + area);

            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Kolor koła: " + color);

            }
        }
    }
}
