import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid marks!";
        } else {
            switch (marks / 10) {
                case 10: 
                case 9: 
                case 8:  
                    grade = "A";
                    break;
                case 7:  
                    grade = "B";
                    break;
                case 6:  
                case 5:  
                    
                    grade = (marks >= 55) ? "C" : "D";
                    break;
                case 4:  
                case 3:  
                case 2:  
                    
                    grade = (marks >= 25) ? "E" : "F";
                    break;
                case 1:  
                case 0:  
                    grade = "F";
                    break;
                default:
                    grade = "Invalid marks!";
            }
        }

        System.out.println("Grade: " + grade);

    }
}
