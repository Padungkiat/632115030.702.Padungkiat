package week7;

public class moutainBike extends bicycle {
    int gear;

    public moutainBike() {

    }

    public void gear(int gear) {
        if (currentspeed <= 99 && currentspeed + (speedingUp * gear) <= 99) {
            currentspeed = currentspeed + (speedingUp * gear);
        }
    }
}
