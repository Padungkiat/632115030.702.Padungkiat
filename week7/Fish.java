package week7;

public class Fish extends Pet {
    String size;
    String water;
    int speed;

    public Fish(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void swimToSea() {
        if (this.water.equals("Salt")) {
            System.out.println("Salt water: true");
            System.out.println("My fish " + name + " swim to the sea.");
        } else {
            System.out.println("Salt water: false");
            System.out.println("My fish " + name + " swim to the river.");
        }
    }

    public void swimFast() {
        System.out.println(size + " Swim " + speed + " km/hr");
    }
}
