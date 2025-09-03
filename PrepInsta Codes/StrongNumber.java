/*
A number is called a Strong Number if the sum of factorial of its digits is equal to the number itself.

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120 => 145
output number  = 145.
*/

import java.util.Scanner;
class StrongNumber{

static int factorial(int num){
int fact = 1;
for(int i = 1; i <= num; i++){
     fact *= i;
}
return fact;
}


static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("please enter the number: ");
int num = sc.nextInt();

if (isStrong(num)) {
            System.out.println("Yes, it's a strong number");
        } else {
            System.out.println("No, it's not a strong number");
        }

}

}