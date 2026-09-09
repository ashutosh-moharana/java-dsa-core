package dsa.strings;

public class StringBuilderEx {
    public static void main(String[] args) {
        String str1 = "Ashutosh";
        String str2  = "Moharanassfsss";
        String str3 = "Ashutosh";

        System.out.println(str1==str3);//check memory location
        System.out.println(str1.compareTo(str3));//lexicographically
        System.out.println(str1.equals(str3));//check content

        System.out.println(str2.compareTo(str1));

        System.out.println(new StringBuilder(str1).reverse().toString().toLowerCase());

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(" Ashutosh!");
        System.out.println(sb);

        System.out.println(sb.charAt(sb.length()-1
        ));

        sb.insert(4,"oooyy");

        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);
        
        StringBuilder st = new StringBuilder("Hello");
        System.out.println(st.capacity());


        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(st.insert(1, "Ash"));

      

        

    }
}
