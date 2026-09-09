package core.patterns;

public class CenteredStarPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1; j<= n+1-i;j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<2*i;k++){
                System.out.print("*");
            }
            for(int j = 1; j<= n+1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


//              *
//             ***
//            *****
//           *******
//          *********


//Ignore the righside spaces and only consider the left side spaces you will get the answer.