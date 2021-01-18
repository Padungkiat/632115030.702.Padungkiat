package week7;

public class Dog extends Pet {
    String size;
    String hair;
    String place;
    String voice;

    public Dog(String name, String species, String color, int age, String size, String hair) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.size = size;
        this.hair = hair;
    }

    public void checkHair() {
        if (this.hair.equals("Short hair")) {
            System.out.println("Short hair: true");
        } else {
            System.out.println("Short hair: false");
        }
    }

    public void run() {
        System.out.println("My Dog "+name + " is run to " + place);
    }

    public void bark() {
        System.out.println(size + " bark " + voice + " " + voice + "!!");
    }
}
