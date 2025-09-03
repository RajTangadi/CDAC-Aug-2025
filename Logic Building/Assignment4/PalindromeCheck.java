import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reversed += clean.charAt(i);
        }

        if (clean.equals(reversed)) {
            System.out.println("The string '" + input + "' is a palindrome");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome");
        }
    }
}
