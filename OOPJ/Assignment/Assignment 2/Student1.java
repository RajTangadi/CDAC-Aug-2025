/*
Problem 9: School Fee System 
Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 
Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee. 
Input Example: 
Student1: Name="Anjali", Class="10th" 
Student2: Name="Vikram", Class="12th" 
Expected Output: 
School Tuition Fee Initialized: 30000 
Student1: Name=Anjali, Class=10th, Tuition Fee=30000 
Student2: Name=Vikram, Class=12th, Tuition Fee=30000 
*/


class Student1 {
    private String name;
    private String className;

    private static int tuitionFee;

    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    public Student1(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public static int getTuitionFee() {
        return tuitionFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static void setTuitionFee(int fee) {
        tuitionFee = fee;
    }

    public void printDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }

    public static void main(String[] args) {
	
        Student1 s1 = new Student1("Anjali", "10th");
        Student1 s2 = new Student1("Vikram", "12th");

        System.out.print("Student1: "); s1.printDetails();
        System.out.print("Student2: "); s2.printDetails();
    }
}
