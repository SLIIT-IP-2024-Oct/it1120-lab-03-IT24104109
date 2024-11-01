import java.util.Scanner;

public class IT24104109Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the rupee amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();

        // Denominations array
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        // Calculate the number of each denomination
        for (int i = 0; i < denominations.length; i++) {
            count[i] = amount / denominations[i]; // Calculate the count of each denomination
            amount %= denominations[i];           // Update the remaining amount
        }

        // Display the result
        System.out.println("Denominations:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes/Coins– " + count[i]);
        }

        scanner.close();
    }
}
