import java.util.Scanner;
class PositiveNegativeCheck{


public static void main(String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter the number: ");

   int num = sc.nextInt();

    if(num < 0){
    System.out.println("number is Negative.");
}   else if(num == 0){
	System.out.println("number is Zero.");	
}	else{
	System.out.println("number is Positive.");
}	


}


}