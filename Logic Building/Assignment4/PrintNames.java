import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[4];

        System.out.print("Enter 4 names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        System.out.println("Names are:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
