/*
A number is a perfect square if its square root is an integer. 
Examples: 25 = 5 × 5 25=5×5  Perfect Square
 50  Not a Perfect Square
*/

import java.util.Scanner;

public class PerfectSquare {

    private static boolean isPerfectSquare(int num) {
        if (num < 0) return false;

        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
	
	    private static boolean isPerfectSquare1(int num) {
        if (num < 0) return false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isPerfectSquare(number)) {
            System.out.println("Yes, it's a Perfect Square");
        } else {
            System.out.println("No, it's not a Perfect Square");
        }
		
		System.out.println("---------------Second method--------------------");
		
		
        if (isPerfectSquare1(number)) {
            System.out.println("Yes, it's a Perfect Square");
        } else {
            System.out.println("No, it's not a Perfect Square");
        }
		
    }
}
