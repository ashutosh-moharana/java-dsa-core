package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class StringPractice {
    public static void main(String[] args) {
//        String str;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter string to reverse:");
//        str = sc.nextLine();
//
//        String[] str2 = str.split(" ");
//        for(String s : str2){
//            System.out.println(s);
//        }
//
//        StringBuilder reversed = new StringBuilder();
//        for(int i= str2.length - 1; i>=0 ; i--){
//            reversed.append(str2[i]);
//            if(i!=0){
//                reversed.append(" ");
//            }
//        }
//        System.out.println(str);
//        System.out.println(reversed);

        String s = "egg";
        String t = "add";
        Map<Character,Character> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }else{
                char ch = map.get(s.charAt(i));
//                if(t.charAt(i) != ch) return false;
            }
        }
//        return false;
    }


}
