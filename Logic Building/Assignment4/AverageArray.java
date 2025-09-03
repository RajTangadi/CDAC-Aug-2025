import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; 
        }

        double average = (double) sum / numbers.length;

        System.out.println("The average of the numbers is: " + average);

        sc.close();
    }
}
