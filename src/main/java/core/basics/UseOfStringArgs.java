package core.basics;

public class UseOfStringArgs {
    public static void main(String[] args) {
        for(String elem: args){
            System.out.println(elem);
        }
    }
}

/*

D:\Desktop\Java-DSA-Core\src\main\java\core\basics>java UseOfStringArgs.java 10 11 12 13 14 15
10
11
12
13
14
15

 */
