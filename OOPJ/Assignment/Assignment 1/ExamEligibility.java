import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

    }
}
