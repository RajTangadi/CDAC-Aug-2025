import java.util.Scanner;
class SumOfNumberRange{

public static void usingLoop(int number1, int number2){
   
   int sum = 0;
   for(int i=number1; i<=number2; i++){
   sum+=i;
   }
   System.out.println("usingLoop: " + sum);
}

public static void usingFormula(int number1, int number2){
   
    int sum = number2*(number2+1)/2 - number1*(number1+1)/2 + number1;
   System.out.println("usingFormula: " + sum);
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number1: ");
int number1 = sc.nextInt();

System.out.print("Enter number2: ");
int number2 = sc.nextInt();

usingLoop(number1, number2);
usingFormula(number1, number2);

 }

}