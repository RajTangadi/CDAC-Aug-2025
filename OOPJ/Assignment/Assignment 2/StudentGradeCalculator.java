/*
Problem 11: Student Grade Calculator 
Scenario: 
Extend previous problem. Add method calculateGrade() which returns: 
● "A" if marks ≥ 80 
● "B" if marks ≥ 60 
● "C" if marks ≥ 40 
● "Fail" otherwise 
● Create 2 students, print marks and grades
*/


class StudentGradeCalculator {
    private String name;
    private int marks;

    public StudentGradeCalculator(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void display() {
        System.out.println("Name: " + name + 
                           ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentGradeCalculator s1 = new StudentGradeCalculator("Ravi", 85);
        StudentGradeCalculator s2 = new StudentGradeCalculator("Anita", 45);

        s1.display();
        s2.display();
    }
}
