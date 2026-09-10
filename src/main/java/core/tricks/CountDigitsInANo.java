package core.tricks;

public class CountDigitsInANo {
    public static void main(String[] args) {
        int digit = 1234;
        int totalDigit = (int)Math.log10(digit) + 1;
        System.out.println(totalDigit);
    }
}

/*
log 1000 = 3 (base 10)
log 1234 = 3.something (base 10) gives decimal
converting into int removes the decimal part = 3
and add 1 = 4
*/
