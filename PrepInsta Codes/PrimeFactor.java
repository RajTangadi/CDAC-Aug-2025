/*
Prime Factors of a number in Java
 
 The program to print all the prime factors of a number in java.
 Prime factorization is a way of expressing a number as a product of its prime factors.
 A prime number is a number that has exactly two factors, 1 and the number itself.

Example :

Input : 12
Output : 2 2 3
*/

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
