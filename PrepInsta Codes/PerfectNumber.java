/*
A number is called a Perfect Number if it is equal to the sum of its proper divisors (excluding the number itself).


6 = 1 + 2 + 3 => 6=1+2+3. Perfect Number 
28 = 1 + 2 + 4 + 7 + 14 =>  28=1+2+4+7+14 Perfect Number 
12 = 1 + 2 + 3 + 4 + 6 => 16 ≠ 12 12=1+2+3+4+6=16 => 16!=12  Not Perfect Number
*/


import java.util.Scanner;

public class PerfectNumber {
    private static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
		
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number)) {
            System.out.println("Yes, it's a Perfect Number");
        } else {
            System.out.println("No, it's not a Perfect Number");
        }
    }
}
