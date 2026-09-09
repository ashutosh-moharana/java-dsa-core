package core.patterns;

public class AlphabetIncrementalTriangle {
    public static void main(String[] args) {
        int m = 5; //for rows only

        for (int i = 1; i <= m; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

//A
//AB
//ABC
//ABCD
//ABCDE
