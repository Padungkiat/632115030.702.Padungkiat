package week9;
class Messi extends Person{
    String career;
    String workState;

    public Messi(String name, int bornYear, String career, String workState){
        super(name, bornYear);
        this.career = career;
        this.workState = workState;

    }
    
    public void introduce() {
        super.introduce();
        System.out.println("I'm a " + career + " and work in " + workState + ".");
    }
}
//My name is Messi, I was born in 1987.
//I’m a football player and work in Barcelona football club