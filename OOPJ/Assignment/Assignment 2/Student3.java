/*
Problem 10: Student Marks Checker 
Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details
*/

class Student3 {
    private int rollNo;
    private String name;
    private int marks;

    public Student3(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void printDetails() {
        System.out.println("Roll No=" + rollNo + ", Name=" + name + ", Marks=" + marks);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(101, "Rahul", 40);

        s1.printDetails();
		
		// Update marks using setter 
        s1.setMarks(55);
		
		// Print updated details
        s1.printDetails();
    }
}
