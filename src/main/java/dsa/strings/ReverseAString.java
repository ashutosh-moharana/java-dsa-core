package dsa.strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "the sky     is blue";
        String[] str = s.trim().split("\\s+");

        int ptr1=0;
        int ptr2=str.length -1;
        while(ptr1<ptr2){
            String temp = str[ptr1];
            str[ptr1] = str[ptr2];
            str[ptr2] = temp;
            ptr1++;
            ptr2--;

        }
        s = String.join(" ",str);
        System.out.println(s);
    }
}
