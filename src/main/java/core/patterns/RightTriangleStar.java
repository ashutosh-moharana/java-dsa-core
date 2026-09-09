package core.patterns;
//*
//* *
//* * *
//* * * *
//* * * * *

public class RightTriangleStar {
    public static void main(String[] args) {
        int m = 5; //for rows only

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

