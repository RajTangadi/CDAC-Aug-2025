import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        printMultiplicationTable(num);
        
        scanner.close();
    }
}
