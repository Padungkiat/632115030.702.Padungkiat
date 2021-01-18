package week7;

public class MainPet {
    public static void main(String[] args) {
        Dog myDog = new Dog("Leo", "Bulldog", "Brown", 3, "Small", "Short hair");
        myDog.voice = "Box";
        myDog.place = "the field";
        System.out.println("My dog");
        myDog.showPetData();
        myDog.run();
        myDog.bark();
        myDog.checkHair();

        Fish myFish = new Fish("KoiKing", "Magikarp", "Red", 5);
        myFish.size = "Small";
        myFish.water = "Salt";
        myFish.speed = 100;
        System.out.println("My Fish");
        myFish.showPetData();
        myFish.swimToSea();
        myFish.swimFast();

        Bird myBird = new Bird("Phoenix", "God", "Red", 1000);
        myBird.size = "Big";
        myBird.fly = "can fly";
        myBird.country = "Ancient egypt";
        myBird.speak = "Immortal";
        System.out.println("My Bird");
        myBird.showPetData();
        myBird.checkCountry();
        myBird.canFly();
        myBird.speak();
    }
}
