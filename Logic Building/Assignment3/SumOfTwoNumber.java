import java.util.Scanner;

public class SumOfTwoNumber {

    public static int sumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int result = sumOfTwoNumbers(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + result + ".");

        scanner.close();
    }
}
