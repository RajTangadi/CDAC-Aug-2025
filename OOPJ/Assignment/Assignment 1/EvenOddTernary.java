
import java.util.Scanner;
class EvenOddTernary{

public static void evenOddTernary(int num){

String result = (num % 2 == 0 ) ? "Even" : "Odd";

System.out.println("Number is " + result);

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();
evenOddTernary(num);


}

}