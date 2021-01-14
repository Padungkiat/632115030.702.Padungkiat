package week6;

public class Chef extends Person {
    String genre;

    public Chef(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void cooking() {
        System.out.println(name + " is cooking " + genre);
    }

    public static void main(String[] args) {
        Chef c = new Chef("Sin", 19, 'M');

        c.genre = "pizza";
        c.introduce();
        c.cooking();

    }
}
