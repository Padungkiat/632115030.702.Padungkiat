package week5;
/**
 *Padungkiat Leksri 
 *632115030 
**/
public class mainCircle {
    public static void main(String[] args) {
        circle cir1 = new circle(0.0, 0.0, 2);
        cir1.Area();
        cir1.Circum();

        circle cir2 = new circle(1.0, 2.0, 3);
        cir2.Area();
        cir2.Circum();

        circle cir3 = new circle(3.0, 5.0, 1);
        cir3.Area();
        cir3.Circum();

        circle cir4 = new circle(-1.0, -10.0, -1);
        cir4.Area();
        cir4.Circum();

        System.out.println("Is circle 1 intersec circle 2 :" + cir1.Intersect(cir2));
        System.out.println("Is circle 1 intersec circle 3 :" + cir1.Intersect(cir3));
    }
}
