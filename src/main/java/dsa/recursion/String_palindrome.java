package dsa.recursion;

public class String_palindrome {

//    This approach will create a new substring in each recursive call
//    So we can use two pointer iterative  approach to optimise that

    //NOTE: In every recursive call ..remember that a funtion is returning
        // something.. so you can use that to return directly.. Solve most of the confusion.

    public static boolean palindromeCheck(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        char left = s.charAt(0);
        char right = s.charAt(s.length() - 1);
        if (left == right) {
            return palindromeCheck(s.substring(1, s.length() - 1));
        }
        return false;
    }

    //Two pointer approach iterative approach

    public static boolean palindromeCheck1(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Found a mismatch
            }
            left++;  // Move forward
            right--; // Move backward
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "hannah";
        boolean isPalindrome = palindromeCheck(s);
        System.out.println(isPalindrome);

    }
}
