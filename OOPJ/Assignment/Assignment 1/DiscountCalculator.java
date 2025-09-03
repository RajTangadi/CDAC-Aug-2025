import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double totalCost = (amount > 1000) ? (amount * 0.90) : amount;

        System.out.println("Total cost after discount: " + totalCost);

        
    }
}
