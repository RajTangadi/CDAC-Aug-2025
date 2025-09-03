
import java.util.Scanner;
class SumOfDigit{

public static void sumOfDigit(int number){

 int sumOfDigit = 0;
 
 while(number > 0){
 
 
    int result = number%10;
	sumOfDigit += result;
	number/=10;
}
	System.out.print(sumOfDigit);
	

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number: ");
int number = sc.nextInt();


sumOfDigit(number);


}

}