package core.patterns;


//        ABCDE
//        ABCD
//        ABC
//        AB
//        A

public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        int m = 5; //for rows only

        for(int i=1; i<=m;i++){
            char ch = 'A';
            for(int j=i;j<=m;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
