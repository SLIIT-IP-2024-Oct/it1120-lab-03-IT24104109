import java.util.Scanner;

public class IT24104109Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Enter the number of kilograms you want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculate the total cost
        double totalCost = pricePerKg * quantity;

        // Calculate the discount (10% of the total cost)
        double discount = totalCost * 0.10;

        // Calculate the final amount after discount
        double finalAmount = totalCost - discount;

        // Display the total amount to be paid after discount
        System.out.println("The amount you have to pay after discount is: " + finalAmount);
        
        scanner.close();
    }
}
