/*
Problem 15:  Employee Auto-ID Generator 
Scenario: 
Create Employee class with id, name, basicSalary. 
● Add static counter starting from 1001 for IDs. 
● Default constructor → name = "Unknown", salary = 20000 
● Parameterized constructor → accept name and salary 
● Getter for all variables 
● Create 2 employees and display their IDs, names, salary

*/

class Employee2 {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;

    public Employee2() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    public Employee2(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2("Raj", 30000);

        System.out.println("ID: " + e1.getId() + ", Name: " + e1.getName() + ", Salary: " + e1.getBasicSalary());
        System.out.println("ID: " + e2.getId() + ", Name: " + e2.getName() + ", Salary: " + e2.getBasicSalary());
    }
}
