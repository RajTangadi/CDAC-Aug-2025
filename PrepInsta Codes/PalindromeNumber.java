import java.util.Scanner;
class PalindromeNumber{

public static void  checkPalindromeNumber(int num){

    int originalNum = num;
    int reverseNum = 0, rem;

    while (num != 0)
        {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        };

       if (originalNum == reverseNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
   
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();
checkPalindromeNumber(num);

}

}