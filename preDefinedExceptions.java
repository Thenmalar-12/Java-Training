import java.util.*;

public class preDefinedExceptions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.println("Enter the denominator: ");
            int denominator = sc.nextInt();

            int output = numerator/denominator;
            System.out.println("The result is: "+output);
        }

        catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (InputMismatchException e){
            System.out.println("Error: Invalid Input!");
        }
        finally{
            System.out.println("The program is executed!");
        }
    }
}