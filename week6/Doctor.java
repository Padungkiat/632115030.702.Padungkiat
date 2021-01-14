package week6;

public class Doctor extends Person {
    String genre;

    public Doctor(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void cureThesick() {
        System.out.println(name + " is healing a " + genre);
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor("Sin", 19, 'M');

        doc.genre = "broken arm.";
        doc.introduce();
        doc.cureThesick();

    }
}
