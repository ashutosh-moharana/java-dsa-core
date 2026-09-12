package dsa.recursion;

public class Permutations {
    public static void main(String[] args) {
        permutations("","ABC");

    }
    public static void permutations(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String l = p.substring(i);
            permutations(f+ch+l, up.substring(1));

        }
    }
}
