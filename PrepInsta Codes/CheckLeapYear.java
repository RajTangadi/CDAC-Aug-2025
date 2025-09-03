import java.util.Scanner;
class CheckLeapYear{

public static void checkLeapYearIf(int year){

    if(year % 400 == 0){
	   System.out.println("Leap Year.");
	} else if(year % 4 == 0 && year % 100 != 0){
	  System.out.println("Leap Year.");
	}	
	else{
	  System.out.println("Not a Leap Year.");
	}

}

public static void checkLeapYearTernary(int year){
      
	  String isLeapYear = (year % 400 ==0) ? "Leap year": (year % 4 == 0 && year % 100 != 0) ? "Leap Year" : "Not a Leap Year";
	  System.out.println(isLeapYear);
}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a year: ");
int year = sc.nextInt();

checkLeapYearIf(year);
checkLeapYearTernary(year);

}

}