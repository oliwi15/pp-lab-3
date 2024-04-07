
import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);

        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();

        System.out.println("Długość boku kwadratu: " + square.getLength());
        System.out.println("Pole kwadratu: " + area);
        System.out.println("Obwód kwadratu: " + perimeter);
    }
}
