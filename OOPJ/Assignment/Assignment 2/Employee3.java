/*
Problem 16: Employee Net Salary 
Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees
*/

class Employee3 {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;

    public Employee3() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    public Employee3(String name, double basicSalary) {
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

    public double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        double pf = 0.02 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    public static void main(String[] args) {
        Employee3 e1 = new Employee3();
        Employee3 e2 = new Employee3("Raj", 30000);

        System.out.println("ID: " + e1.getId() + ", Name: " + e1.getName() + ", Net Salary: " + e1.calculateNetSalary());
        System.out.println("ID: " + e2.getId() + ", Name: " + e2.getName() + ", Net Salary: " + e2.calculateNetSalary());
    }
}
