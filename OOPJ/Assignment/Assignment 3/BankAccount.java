/*
1. Bank Account Protection 
Scenario: You are creating a simple banking system. A user should not be able to directly change their 
balance. 
Problem Statement: 
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to 
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance. 
Class/Fields: 
● private double balance 
Methods: 
● deposit(double amount) → add to balance 
● withdraw(double amount) → subtract from balance if sufficient 
● getBalance() → returns current balance 
Sample Input: 
Deposit = 5000 
Withdraw = 2000 
Sample Output: 
Updated Balance = 30
*/

import java.util.Scanner;
class BankAccount{

private double balance;

public void setBalance(double balance){
this.balance = balance;
}

public BankAccount(double balance){
	this.balance = balance;
}
	
public Double getBalance(){
return balance;
}
		
void deposit(double amount){
   balance += amount;
}

void withdraw(double amount) {

if(balance > 0 && amount <= balance){
	balance -= amount;
}else{
    System.out.println("amount exceed...");
}	
}
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("deposit =  ");
	double depositAmount = sc.nextInt();
	System.out.print("withdraw = ");
	double withdrawAmount = sc.nextInt();
	BankAccount balance = new BankAccount(25000.0); 
	balance.deposit(depositAmount);
	balance.withdraw(withdrawAmount);
	System.out.println("Updated Balance = " + balance.getBalance());
	
	
	
}

}