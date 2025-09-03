import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int first = 0, second = 1, nth = 0;

        if (n == 1) {
            nth = first;
        } else if (n == 2) {
            nth = second;
        } else {
            for (int i = 3; i <= n; i++) {
                nth = first + second;
                first = second;
                second = nth;
            }
        }

        System.out.println("The " + n + "th term of Fibonacci series is: " + nth);

        sc.close();
    }
}
