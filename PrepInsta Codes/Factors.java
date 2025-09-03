/*
Find the Factors of a Number in Java
Given an integer number as the input, the objective is to Find all the factors of a Number. Therefore, we’ll write a code to Find the Factors of a Number in Java Language.

Example
Input : 10
Output : 1, 2, 5
*/

import java.util.Scanner;
public class Factors{

static void factor(int num){

  for(int i = 1; i < num; i++){
   if(num % i == 0){
      System.out.print(i + " ");
	  }
   }

}

public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
 
 int num = sc.nextInt();
 factor(num);
 
 }

}