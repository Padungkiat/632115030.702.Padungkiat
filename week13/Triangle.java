package week13;

public class Triangle extends Area {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return 0.5 * height * base;
    }

}
