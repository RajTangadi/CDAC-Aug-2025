import java.util.Scanner;

public class GoodMorning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Time: ");
        int time = scanner.nextInt();

        if (time >= 0 && time <= 23) {
            if (time >= 5 && time <= 12) {
                System.out.println("Good Morning");
            } else {
                System.out.println("Not Morning Time");
            }
        } else {
            System.out.println("Invalid time entered. Please enter a number between 0 and 23.");
        }

        scanner.close();
    }
}
