
import java.util.Scanner;
class VowelConTernary{

public static void vowelConTernary(char character){

String VowelOrConsonant =  (character == 'A' || character == 'E'|| character == 'I'|| character == 'O'|| character == 'U') ? "Vowel" : "Consonant";

System.out.println(VowelOrConsonant);

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter character: ");
char character = Character.toUpperCase(sc.next().charAt(0));


vowelConTernary(character);


}

}