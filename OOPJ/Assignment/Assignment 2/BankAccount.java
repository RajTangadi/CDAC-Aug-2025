/*
Problem 8: Bank Account Initialization 
Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 
Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 
Input Example: 
Account1: Name="Rohit", Balance=5000 
Account2: Name="Priya", Balance=15000 
Expected Output: 
Bank Interest Rate Initialized: 4.0% 
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0% 
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0% 
C
*/


class BankAccount {
    private String name;
    private double balance;

    // Static variable for interest rate
    private static double interestRate;

    // Static block to initialize interest rate (runs once when class is loaded)
    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void printDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }

    public static void main(String[] args) {
        
        BankAccount Account1 = new BankAccount("Rohit", 5000);
        BankAccount Account2 = new BankAccount("Priya", 15000);

        System.out.print("Account1: "); Account1.printDetails();
        System.out.print("Account2: "); Account2.printDetails();
    }
}
