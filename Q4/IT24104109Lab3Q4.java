import java.util.Scanner;

public class IT24104109Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is five digits
        if (number >= 10000 && number <= 99999) {
            // Separate each digit and store it in an array
            int[] digits = new int[5];
            for (int i = 4; i >= 0; i--) {
                digits[i] = number % 10; // Get the last digit
                number /= 10;            // Remove the last digit
            }

            // Print the digits separated by spaces
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + " ");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close();
    }
}
