package week6;

public class Engineer extends Person {
    String genre;

    public Engineer(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void building() {
        System.out.println(name + " is designing " + genre);
    }

    public static void main(String[] args) {
        Engineer engin = new Engineer("Sin", 19, 'M');

        engin.genre = "Home.";
        engin.introduce();
        engin.building();

    }
}
