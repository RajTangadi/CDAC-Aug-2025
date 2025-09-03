
import java.util.Scanner;
class MenuBasedArithmeticOper{

public static void arithmeticOperation(int operation, int num1, int num2){

    switch(operation){
	
	case 1: {
	System.out.print("Result: " + (num1 + num2));
	break;
	}
	case 2: {
	System.out.print("Result: " + (num1 - num2));
	break;
	}default:{
	System.out.println("Please enter valid number ");
	}
}


}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Select operation (1-Addition, 2-Subtraction): ");
int operation = sc.nextInt();

System.out.print("Enter first number: ");
int num1 = sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();


arithmeticOperation(operation, num1, num2);

}

}