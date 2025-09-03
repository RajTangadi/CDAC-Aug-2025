import java.util.Scanner;
public class EvenOddLocker{

public static void evenOddLocker(int lockerNumber){

if(lockerNumber % 2 ==0){
System.out.println("Even locker number");
}else{
System.out.println("Odd locker numer");
}

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter locker number: ");
int lockerNumber = sc.nextInt();
evenOddLocker(lockerNumber);

}

}