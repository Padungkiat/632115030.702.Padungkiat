package week6;

public class Teacher extends Person {
    String genre;

    public Teacher(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void teach() {
        System.out.println(name + " is teaching " + genre);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Sin", 19, 'M');

        t.genre = "student.";
        t.introduce();
        t.teach();

    }
}
