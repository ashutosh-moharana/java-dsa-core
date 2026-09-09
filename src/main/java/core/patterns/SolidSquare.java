package core.patterns;

import java.util.Scanner;


/*
        *****
        *****
        *****
        *****
        *****
*/

public class SolidSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows:");
        int m = sc.nextInt();
        System.out.print("Enter no of columns:");
        int n = sc.nextInt();


        System.out.println("Here is your pattern: ");
      for(int i=1 ;i<=m ;i++){
          for(int j=1;j<=n;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }

}
