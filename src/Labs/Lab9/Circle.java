package Labs.Lab9;

public class Circle {
    private double radius;
    private double circumference;
    private double square;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.circumference = 2 * Math.PI * this.radius;
        this.square = Math.PI * (this.radius * this.radius);

    }

    public Circle(double radius) {
        this.radius = radius;
        this.circumference = 2 * Math.PI * this.radius;
        this.square = Math.PI * (this.radius * this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
