/*
Problem 13: Bank Deposit & Withdrawal 
Scenario: 
Extend previous problem. Add methods: 
● deposit(double amount) → adds to balance 
● withdraw(double amount) → subtracts from balance 
● Create two accounts, perform deposit/withdraw, display updated balance. 
*/

class BankAccount2 {
    private String accountHolder;
    private double balance;

    public BankAccount2(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount2 acc1 = new BankAccount2("Raj", 60000.50);
        BankAccount2 acc2 = new BankAccount2("Anita", 8000);
      
	    System.out.println("\n--- initial Account Details ---");
        acc1.display();
        acc2.display();
	    System.out.println("----------------------------------------");

        acc1.deposit(2000);
        acc1.withdraw(5000);

        acc2.deposit(3000);
        acc2.withdraw(12000);  

        // Display updated balances
        System.out.println("\n--- Final Account Details ---");
        acc1.display();
        acc2.display();
    }
}
