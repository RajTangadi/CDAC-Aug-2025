import java.util.Scanner;

public class SumCalculator {

    public static int calculateSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            int result = calculateSum(num);
            System.out.println("The sum of numbers from 1 to " + num + " is: " + result);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
