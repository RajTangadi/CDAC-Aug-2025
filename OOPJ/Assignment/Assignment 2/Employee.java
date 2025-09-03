/*
Problem 4: Employee Salary Manager 
Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees 
who have worked more than 5 years. 
Requirements: 
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService 
(int). 
2. Create static variable totalEmployees to store the number of employees created. 
3. Constructor should initialize all instance variables and increment totalEmployees. 
4. Create getters and setters for all instance variables. 
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0. 
6. Create a static method showTotalEmployees() to print total employees created. 
7. Write a main class to create 3 employees, print their bonuses, and print total employees. 
Input Example: 
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6 
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3 
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5 
Expected Output: 
Employee Ravi Bonus: 7500.0 
Employee Anita Bonus: 0.0 
Employee Suresh Bonus: 0.0 
Total employees: 3
*/

class Employee {
    private String name;
    private double salary;
    private int yearsOfService;

    // Static variable to track total employees
    private static int totalEmployees = 0;

    
    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;  
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05; // 5% bonus
        } else {
            return 0.0;
        }
    }

    // Static method to show total employees
    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }


    public static void main(String[] args) {
        // Create 3 employees
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee " + e1.getName() + " Bonus: " + e1.calculateBonus());
        System.out.println("Employee " + e2.getName() + " Bonus: " + e2.calculateBonus());
        System.out.println("Employee " + e3.getName() + " Bonus: " + e3.calculateBonus());

        // Show total employees created
        Employee.showTotalEmployees();
    }

}