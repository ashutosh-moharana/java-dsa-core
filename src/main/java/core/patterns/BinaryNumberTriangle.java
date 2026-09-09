package core.patterns;

public class BinaryNumberTriangle {
    public static void main(String[] args) {
        int m = 5; //for rows only
        int count=1;

        for(int i=1; i<=m;i++){
            for(int j=1;j<=i;j++){
                if(count==1){
                    System.out.print(count+" ");
                    count=0;
                }else{
                    System.out.print(count+" ");
                    count=1;
                }
            }
            System.out.println();
        }

    }
}


//1
//0 1
//0 1 0
//1 0 1 0
//1 0 1 0 1