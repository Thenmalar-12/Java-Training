import java.util.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class verifyAge {
    public static void verifyAge(int age) throws CustomException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age entered.");
        }
        if (age < 18) {
            throw new CustomException("You must be 18 or older to purchase this product.");
        }
        System.out.println("Purchase successful! Thank you for shopping.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            verifyAge(age);
            
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            scanner.close();
            System.out.println("Thank you for visiting our store.");
        }
    }
}
