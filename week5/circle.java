package week5;
/**
 *Padungkiat Leksri 
 *632115030 
**/
public class circle {
    private double radius = 0;
    private double x = 0;
    private double y = 0;
    private static int num = 0;

    public circle(double x, double y) {
        num++;
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public circle(double x, double y, double radius) {
        num++;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void Area() {
        if (radius < 0) {
            System.out.println("Area of cir" + num + " = 0");
        } else {
            System.out.println("Area of cir" + num + " = " + Math.PI * (radius * radius));
        }
    }

    public void Circum() {
        if (radius < 0) {
            System.out.println("CircumFrenece 0f " + num + " = 0");
        } else {
            System.out.println("CircumFrenece 0f " + num + " = " + (2 * Math.PI * radius));
        }
    }

    public boolean Intersect(circle C2) {
        double Distance = Math.sqrt(Math.pow(this.x - C2.x, 2) + Math.pow(this.y - C2.y, 2));
        if (Distance > this.radius + C2.radius) {
            return false;
        } else {
            return true;
        }
    }
}
