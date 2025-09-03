import java.util.Scanner;
class PrimeNumberRange{


public static boolean primeNumber(int num){

	if(num < 2){
		return false;
	}
      
      for(int i  = 2; i <= num/2; i++){ 
	  if(num % i == 0){
	   return false;
	  }
  }
  return true;
}


public static void primeNumberRange(int lower, int upper){
  
  System.out.println("Prime numbers are: ");
  for(int i = lower; i <= upper; i++){
    if(primeNumber(i)){
	System.out.print(i + " ");
  }
  }
  

	  
}



public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a prime number range(source-destination) : ");
int num1 = sc.nextInt();
int num2 = sc.nextInt();

primeNumberRange(num1, num2);

}

}