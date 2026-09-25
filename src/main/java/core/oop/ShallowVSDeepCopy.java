package core.oop;

public class ShallowVSDeepCopy {
    public static void main(String[] args) {
        Random r = new Random(10,20);
        Random r1 = new Random(r); // Deep Copy - Create another object in heap with same value as r
        Random r2 = r; //Shallow Copy - Points to same obj as r
    }

}
