package week9;

class Tu extends Person{
    String workState;
    String career;

    public Tu(String name, int bornYear, String career, String workState){
        super(name, bornYear);
        this.career = career;
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a " + career + " and work in " + workState + ".");
    }
}
//My name is Tu, I was born in 1954.
//I’m a prime minister and work in Thailand.