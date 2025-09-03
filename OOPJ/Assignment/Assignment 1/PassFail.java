import java.util.Scanner;
class PassFail {

public static void checkPassOrFail(int marks){

    if (marks >= 35) {
        System.out.println("student has passed");
    } else {
        System.out.println("student has failed");
     }

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

   System.out.print("Enter marks: ");
   int marks = sc.nextInt();

   checkPassOrFail(marks);

}

}