package week7;

public class bicycle {
    int currentspeed;
    int speedingUp;
    int takeABreak;

    public bicycle() {

    }

    public void currentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
        System.out.println("The speed for the bike is: " + currentspeed);
    }

    public void currentspeed() {
        System.out.println("The speed for the bike is: " + currentspeed);
    }

    public void speedUp(int speedingUp) {
        if (currentspeed <= 99 && speedingUp + currentspeed <= 99) {
            currentspeed = currentspeed + speedingUp;
            System.out.println("Speed up!!");
        } else {
            System.out.println("Sorry,the maximum speed is 99 km/h");
        }
    }

    public void takeabreak(int takeABreak) {
        currentspeed = currentspeed - takeABreak;
        if (currentspeed == 0) {
            System.out.println("Bike stop");
        }
    }
}
