import java.util.Scanner;
class SumOfDigit{

public static void sumOfDigit(int num){

  int sum = 0;

  while(num!=0){
         sum += num % 10;
         num = num / 10;
     }

       System.out.println ("Sum of digits : " + sum);
   

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number: ");
int num = sc.nextInt();
sumOfDigit(num);

}

}