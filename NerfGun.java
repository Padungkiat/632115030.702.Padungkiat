package Lab7;
/**
 * Padungkiat Leksri
 * 632115030
 **/
public class NerfGun {
    private static int gunID;
    private int ammunition = 0;

    public NerfGun() {
        gunID++;
        this.ammunition = 0;
    }

    public NerfGun(int num) {
        gunID++;
        this.ammunition = num;
    }

    public void fire() {
        if (ammunition == 0) {
            System.out.println("There is no ammunition");
        } else {
            this.ammunition--;
            System.out.println("BANG !!!");
        }
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + gunID);

    }

    public void reload(int reload) {
        if (ammunition + reload <= 15) {
            this.ammunition = ammunition + reload;
        } else {
            System.out.println("Error!! the ammunition is overload");
        }
    }

    public void displayNumOfAmmunition() {
        System.out.println(ammunition+" bullet left");
    }
}
