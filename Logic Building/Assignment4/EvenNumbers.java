import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
		
        int n = sc.nextInt();

        // Print even numbers from 1 to N
        for (int i = 2; i <= n; i += 2) {  
            System.out.print(i + " ");
        }

        sc.close();
    }
}
