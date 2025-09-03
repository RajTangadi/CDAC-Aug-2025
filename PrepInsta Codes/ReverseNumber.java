import java.util.Scanner;
class ReverseNumber{

public static void reverseNumber(int num){

    int reverse = 0, rem;

    while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };

       System.out.println ("Reversed Number: " + reverse);
   
}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number to be reverse: ");
int num = sc.nextInt();
reverseNumber(num);

}

}