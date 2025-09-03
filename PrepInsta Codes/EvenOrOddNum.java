import java.util.Scanner;
class EvenOrOddNum{
	
	
	static void evenOrOddTernary(int num){
		String evenOdd = (num % 2 ==0) ? "Even number" : "Odd Number";
		System.out.println(evenOdd);
	}	
	
	static void conditionalIfElse(int num){
	  if(num == 0){
      System.out.println("Please enter valid number.");

	}else{
	
    if(num % 2 == 0){
    System.out.println("Even Number.");
    }else{
	System.out.println("Odd Number.");
       }	
     }
				
   } 		
		


public static void main(String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter the number: ");

   int num = sc.nextInt();
   
   evenOrOddTernary(num);
   conditionalIfElse(num)
   
   /*
    
	
*/

}


}