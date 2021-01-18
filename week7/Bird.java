package week7;

public class Bird extends Pet {
    String size;
    String country;
    String fly;
    String speak;

    public Bird(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void canFly() {
        if (this.fly.equals("can fly")) {
            System.out.println("Can fly: true");
            System.out.println("My Bird " + name + " fly to sky.");
        } else {
            System.out.println("Can fly: false");
            System.out.println("My Bird " + name + " walk to field.");
        }
    }

    public void checkCountry() {
        System.out.println("My Bird is from the: " + country);
    }

    public void speak() {
        System.out.println(size + " Speak: " + speak + "!!");
    }
}
