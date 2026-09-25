package core.oop;

public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("X = "+x+", Y = "+y); // X = 10, Y = 20
        addValue(x,y);
        System.out.println("X = "+x+", Y = "+y); // X = 10, Y = 20
    }
    public static void addValue(int x, int y){
        x = x+10;
        y = y+10;
    }
}
