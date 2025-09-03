import java.util.Scanner;
class SumOfNaturalNumber{

public static void usingLoop(int num){

int sum = 0;
for(int i = 1; i <= num; i++){
   sum += i;
 }
 System.out.println("usingLoop : " + sum);
}

public static void usingFormula(int num){
System.out.println("usingFormula: " + num*(num+1)/2);
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: " );
int num = sc.nextInt();

usingLoop(num);
usingFormula(num);


 }


}