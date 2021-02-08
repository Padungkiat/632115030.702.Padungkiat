package week9;

class Me extends Person{
    String career;
    String workState;

    public Me(String name, int bornYear, String career, String workState){
        super(name,bornYear);
        this.career = career;
        this.workState = workState;

    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a " + career + " and work in " + workState + ".");
    }
}
