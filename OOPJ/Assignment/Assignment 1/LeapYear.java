import java.util.Scanner;
class LeapYear {

public static void checkLeapYear(int year){

    if (year % 4 == 0) {
        System.out.println( year + " is a leap year");
    } else {
        System.out.println(year + " is not a leap year");
     }

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

   System.out.print("Enter Year: ");
   int year = sc.nextInt();

   checkLeapYear(year);

}

}