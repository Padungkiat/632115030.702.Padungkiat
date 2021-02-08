package week9;

class Ball extends Person {
    String workState;
    String career;

    public Ball(String name, int bornYear, String career, String workState){
        super(name, bornYear);
        this.career = career;
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a " + career + " and teach the student in " + workState + ".");
    }
}
// My name is Ball, I was born in 1977.
// I’m a teacher and teach the students in CMU
