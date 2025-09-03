import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int age3 = scanner.nextInt();

        String oldest;
        if (age1 >= age2 && age1 >= age3) {
            oldest = "Friend 1";
        } else if (age2 >= age1 && age2 >= age3) {
            oldest = "Friend 2";
        } else {
            oldest = "Friend 3";
        }

        String youngest;
        if (age1 <= age2 && age1 <= age3) {
            youngest = "Friend 1";
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = "Friend 2";
        } else {
            youngest = "Friend 3";
        }

        System.out.println("Oldest: " + oldest);
        System.out.println("Youngest: " + youngest);

    }
}
