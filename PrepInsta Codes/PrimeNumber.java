import java.util.Scanner;
class PrimeNumber{

public static void primeNumber(int num){
	
	if(num < 2){
		System.out.println(num + " is not prime number ");
	}
      int prime = 0;
      for(int i  = 1; i <= num; i++){
	  
	  if(num % i == 0){
	   prime++;
	  }
  }
	  if(prime > 2){
	  System.out.println(num + " is not prime number " + prime);
	  }else{
	  System.out.println(num + " is prime number "+ prime);
	  }
}


public static void primeNumber1(int num){
	boolean isPrime = true;
	
	if(num < 2){
	isPrime = false;	
	} else {	
	
	for(int i = 2; i <= num/2; i++){
		
	if(num % i == 0){	
	isPrime =false;
     break;
	}	 
	}
}

 String isPrimeOrNot =  isPrime ? "prime number" : "not prime number"; 
  System.out.println(isPrimeOrNot);

	
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();
primeNumber(num);
primeNumber1(num);
}

}