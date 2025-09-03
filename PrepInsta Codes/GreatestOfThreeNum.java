import java.util.Scanner;
class GreatestOfThreeNum{

public static void greatestOfThreeNumUsingIf(int num1, int num2, int num3){

       if(num1 > num2 && num1 > num3){
	   System.out.println("Greatest number is: " + num1);
	   }else if(num2 > num1 && num2 > num3){
	    System.out.println("Greatest number is: " + num2);
	   }else{
	   	   System.out.println("Greatest number is: " + num3);
	   }

}

public static void greatestOfThreeNumUsingTernary(int num1, int num2, int num3){

int greatestNumber = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ?  num2:num3;
System.out.println("Greatest number is: " + greatestNumber);
}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a num1: ");
int num1 = sc.nextInt();


System.out.print("Enter a num2: ");
int num2 = sc.nextInt();

System.out.print("Enter a num3: ");
int num3 = sc.nextInt();

greatestOfThreeNumUsingIf(num1, num2, num3);
greatestOfThreeNumUsingTernary(num1, num2, num3);

}

}
