
import java.util.Scanner;
class LeapYearTernary{

public static void leapYearTernary(int year){

String leapYear =  (year % 4 == 0) ? "Leap Year" : "Not leap Year";

System.out.println(leapYear);

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter year: ");
int year = sc.nextInt();


leapYearTernary(year);


}

}