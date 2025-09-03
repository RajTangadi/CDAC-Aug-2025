
import java.util.Scanner;
class SmallestNumTernary{

public static void smallestNumTernary(int numbers[]){

int smallestNumber = (numbers[0] < numbers[1] && numbers[0] < numbers[2] ) ? numbers[0] : (numbers[1] < numbers[0] && numbers[1] < numbers[2] ) ? numbers[1]: numbers[2];

System.out.println("Smallest number: " + smallestNumber);

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int numbers[] = new int[3];
System.out.print("Enter numbers: ");

for(int i =0; i < numbers.length; i++){
   numbers[i]= sc.nextInt();
}


smallestNumTernary(numbers);


}

}