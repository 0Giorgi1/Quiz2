package quizes.q2.giorgi_kitiashvili_2.field;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int otherExpenses = readOtherExpensesFromFile("expenses.txt"); // Read other expenses from file
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalExpenses);
        System.out.println("Profit in Laris: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalExpenses) {
        // Calculate total revenue
        int totalRevenue = pricePerCoffee * numCoffeeSold;

        // Calculate profit in Tetri
        int profitInTetri = totalRevenue - totalExpenses;

        // Convert profit to Laris (100 Tetri = 1 Lari)
        double profitInLaris = profitInTetri / 100.0;

        return profitInLaris;
    }

    public static int readOtherExpensesFromFile(String filename) {
        int totalExpenses = 0;

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                totalExpenses += scanner.nextInt(); // Read and sum up expenses
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return totalExpenses;
    }
}
