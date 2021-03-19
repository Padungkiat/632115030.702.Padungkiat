package week13;

public class Main {
    public static void main(String[] args) {
        Area rectangle = new Rectangle(4,5);
        Area circle = new Circle(7);
        Area triangle = new Triangle(10, 15);

        System.out.println("----------------------Rectangle----------------------------");
        System.out.println("The area of this rectangle is "+rectangle.getArea());
        System.out.println("");

        System.out.println("-----------------------Circle-------------------------------");
        System.out.println("The area of this circle is "+circle.getArea());
        System.out.println("");

        System.out.println("----------------------Triangle------------------------------");
        System.out.println("The area of this triangle is "+triangle.getArea());
        System.out.println("");
    }
}
