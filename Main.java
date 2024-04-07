import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Długość prostokąta: " + rectangle.getLength());
        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Pole prostokąta: " + area);
        System.out.println("Obwód prostokąta: " + perimeter);
    }
}