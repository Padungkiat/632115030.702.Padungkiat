package week6;

/**
 * Person
 */
public class Person {
    String name;
    char gender;
    int age;

    public Person() {

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("My name is " + name + " age " + age + " gender " + gender);
    }
}