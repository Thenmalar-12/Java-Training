import java.util.*;
class ATM {

    public void withdraw(int amount) {
        System.out.println("Withdrawn: Rs. " + amount + " using ATM card.");
    }

    public void withdraw(int amount, String upiId) {
        System.out.println("Withdrawn: Rs. " + amount + " using UPI ID - " + upiId);
    }

    public void withdraw(int amount, long accountNumber) {
        System.out.println("Withdrawn: Rs. " + amount + " from Account - " + accountNumber);
    }


    public void showBalance() {
        System.out.println("Fetching balance from ATM...");
    }
}


class BankATM extends ATM {
    private double balance = 5000;

    public void showBalance() {
        System.out.println("Your current bank balance is: Rs. " + balance);
    }
}


public class polymorphism {
    public static void main(String[] args) {

        BankATM atm = new BankATM();
        atm.withdraw(500); 
        atm.withdraw(1000, "hi@upi"); 
        atm.withdraw(2000, 1234567890L); 

        System.out.println();
        atm.showBalance(); 
    }
}
