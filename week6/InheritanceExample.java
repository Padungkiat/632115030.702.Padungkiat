package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Sin", 19, 'M');

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

    }
}
