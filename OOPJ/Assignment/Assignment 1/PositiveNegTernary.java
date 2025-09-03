
import java.util.Scanner;
class PositiveNegTernary{

public static void positiveNegTernary(int num){

String result = (num > 0 ) ? "Positive" : (num < 0) ? "Negative" : "Zero";

System.out.println("Number is " + result);

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();
positiveNegTernary(num);


}

}