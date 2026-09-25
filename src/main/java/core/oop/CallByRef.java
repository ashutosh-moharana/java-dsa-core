package core.oop;
// But Java Doesn't Support Call by Reference. It only Supports Call by Value
public class CallByRef {
    public static void main(String[] args) {
      Random r = new Random();
      r.x = 10;
      r.y = 20;
        System.out.println("X = "+ r.x+", Y = "+r.y);// X = 10, Y = 20
        addValue(r);
        System.out.println("X = "+ r.x+", Y = "+r.y);// X = 20, Y = 40

    }

    public static void addValue(Random r){
    r.x = r.x +10;
    r.y = r.y + 20;
    }
}

class Random{
    int x;
    int y;
    Random(){}
    Random(int x, int y){
        this.x = x;
        this.y = y;
    }
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
