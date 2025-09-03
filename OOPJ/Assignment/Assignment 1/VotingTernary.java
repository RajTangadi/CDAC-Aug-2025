
import java.util.Scanner;
class VotingTernary{

public static void votingTernary(int age){

String result = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";


System.out.println(result);

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter age: ");
int age = sc.nextInt();
votingTernary(age);


}

}