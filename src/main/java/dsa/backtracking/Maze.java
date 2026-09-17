package dsa.backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3)); //output: 6
        System.out.println(count(4, 4)); //output: 20
    }
    public static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;

        return count(r - 1, c) + count(r, c - 1);
    }
}
