/*
Problem 14: Bank Name Display 
Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation
*/

class BankAccount3 {
    private String accountHolder;
    private double balance;

    static String bankName = "CDAC Bank";

    public BankAccount3(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
        displayBankName();

        BankAccount3 acc1 = new BankAccount3("Raj", 20000);

        acc1.display();
    }
}
