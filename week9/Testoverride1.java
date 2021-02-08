package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();

        Person person2;
        person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();

        Person person3;
        person3 = new Ball("Ball", 1977, "Teacher", "CMU");
        person3.introduce();

        Person person4;
        person4 = new Tu("Tu", 1954, "prime minister", "Thailand");
        person4.introduce();

        Person person5;
        person5 = new Messi("Messi", 1987, "football player", "Barcelona football club");
        person5.introduce();

        Person person6;
        person6 = new Me("Padungkiat", 2001, "Student", "CMU");
        person6.introduce();
    }
}
