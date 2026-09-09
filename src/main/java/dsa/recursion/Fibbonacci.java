package dsa.recursion;

public class Fibbonacci {
    public static void main(String[] args) {
         fibbonacci(0,1,30);
    }
    public static void fibbonacci(int a, int b, int no){
        if(no==0) return;
        System.out.println(a);
        int sum = a+b;
        fibbonacci(b,sum , no-1);
    }
}
