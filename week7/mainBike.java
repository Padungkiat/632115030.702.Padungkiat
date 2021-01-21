package week7;

public class mainBike {
    public static void main(String[] args) {
        bicycle bike1 = new bicycle();

        System.out.println("Normal Bike");
        bike1.currentspeed(20);
        bike1.speedUp(5);
        bike1.speedUp(100);
        bike1.currentspeed();
        bike1.takeabreak(25);

        moutainBike bike2 = new moutainBike();

        System.out.println("Mountain Bike");
        bike2.currentspeed(20);
        bike2.gear(1);
        bike2.speedUp(5);
        bike2.currentspeed();
        bike2.gear(2);
        bike2.speedUp(5);
        bike2.currentspeed();
        bike2.takeabreak(30);
    }
}
