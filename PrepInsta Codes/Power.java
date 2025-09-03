import java.util.Scanner;
class Power{

static void usingPowMethod(double base, double power){
     double result = (double) Math.pow(base,power);
	 System.out.println(result);
	 
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Please enter base and power");

double base = sc.nextInt();
double power = sc.nextInt();

usingPowMethod(base, power);

 }

}