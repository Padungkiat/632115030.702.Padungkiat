package week9;

public class Cube {
    int w;
    int h;
    int length;

    public Cube(int w, int h, int l){
        this.w = w;
        this.h = h;
        this.length = l;
    }

    public String toString(){
        return "This is a cube with the side of "+length;
    }

}
//This is a cube with the side of [length]
