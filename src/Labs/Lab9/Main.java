package Labs.Lab9;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(56.54, "Black");
        System.out.println("Длина окружности - " + circle.getCircumference());
        System.out.println("Площадь - " + circle.getSquare());
        System.out.println("Радиус - " + circle.getRadius());
        System.out.println("Цвет - " + circle.getColor());
        System.out.println();
        Circle circle1 = new Circle(6.2);
        System.out.println("Длина окружности - " + circle1.getCircumference());
        System.out.println("Площадь - " + circle1.getSquare());
        System.out.println("Радиус - " + circle1.getRadius());
        System.out.println("Цвет - " + circle1.getColor());
    }
}
