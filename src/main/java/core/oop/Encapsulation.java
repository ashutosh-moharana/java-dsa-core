package core.oop;

public class Encapsulation {
    public static void main(String[] args) {
        Bank b  = new Bank();
    }
}
class Bank{
    private int balance = 100;
    // Here we're not restricting access to the balance.
    // We are just restricting the direct access to the balance.

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        //More validations
        this.balance = balance;
    }


}
