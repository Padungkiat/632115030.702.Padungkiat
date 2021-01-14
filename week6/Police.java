package week6;

public class Police extends Person{
    String genre;

    public Police(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void working() {
        System.out.println(name + " is following to catch " + genre);
    }

    public static void main(String[] args) {
        Police p = new Police("Sin", 19, 'M');

        p.genre = "the thief";
        p.introduce();
        p.working();

    }
}
