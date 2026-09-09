package core.patterns;

public class DiamondStar {
    public static void main(String[] args) {
        int n= 7;
        for(int i=1; i<=n/2; i++){
            for(int j =1 ;j<=n-3-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<2*i;k++){
                System.out.print("*");
            }
            for(int j =1 ;j<=n-3-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }


        for(int i= n/2+1 ; i<=n;i++){
            for(int j =1 ;j<i-(n/2);j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1;k++){
                System.out.print("*");
            }
            for(int j =1 ;j<i-(n/2);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
