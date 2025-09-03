import java.util.Scanner;
class SeasonMonth{

public static void 	printSeason(int month){

    switch(month){
	
	case 12: case 1: case 2:
	{
	System.out.println("Winter");
	break;
	}
	case 3: case 4: case 5:
	{
	System.out.println("Summer");
	break;
	}
	case 6: case 7: case 8:
	{
	System.out.println("Monsoon");
	break;
	}
	case 9: case 10: case 11:
	{
	System.out.println("Autumn");
	break;
	}default:{
	System.out.println("Please Enter valid number ");
	}
	
	}

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter month number: ");
int month = sc.nextInt();
printSeason(month);

}

}
