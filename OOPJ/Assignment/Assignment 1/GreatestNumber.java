import java.util.Scanner;

class GreatestNumber{

public static void GreaterNum(int test1, int test2){
   
   if(test1 > test2){
   System.out.println("Test 1 has higher score.");
   }else{
   System.out.println("Test 2 has higher score.");
   }

 
 }


public static void main(String args[]){

   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter score for Test1: ");
   int test1 = sc.nextInt();
   
   System.out.println("Enter score for Test2: ");
   int test2 = sc.nextInt();
   
   GreaterNum(test1,test2);



  }

}

