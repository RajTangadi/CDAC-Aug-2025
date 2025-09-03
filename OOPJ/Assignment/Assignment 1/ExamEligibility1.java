import java.util.Scanner;

public class ExamEligibility1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter classes held: ");
        int classesHeld = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int classesAttended = sc.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medicalCause = sc.next().charAt(0);

        double attendancePercentage = (classesAttended * 100.0) / classesHeld;
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else if (medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }

        sc.close();
    }
}
