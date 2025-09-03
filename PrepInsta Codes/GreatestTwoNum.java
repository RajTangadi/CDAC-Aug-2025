import java.util.Scanner;
class GreatestTwoNum{

public static void greatestNumberUsingIfElse(int num1, int num2){
 if (num1 == num2){
       System.out.println ("both are equal");
	   }
     else if (num1 > num2){
         System.out.println (num1 + " is greater");
         }
     else{
         System.out.println (num2 + " is greater");
         }
}
public static void greatestNumberUsingTernary(int num1, int num2){

    if(num1 == num2){
	System.out.println ("Both are Equal");
	}else{
    int greaterNum = (num1 > num2) ? num1 : num2;
	System.out.println(greaterNum +  " is greater");
	}
}

public static void greatestNumberUsingIfElseMaxFun(int num1, int num2){

       if (num1 == num2)
        System.out.println("both are equal");
        else
		System.out.println(Math.max(num1, num2) + " is greater");

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number1: ");
int num1 = sc.nextInt();

System.out.print("Enter a number2: ");
int num2 = sc.nextInt();

greatestNumberUsingIfElse(num1, num2);
greatestNumberUsingTernary(num1,num2);
greatestNumberUsingIfElseMaxFun(num1,num2);

}

}
