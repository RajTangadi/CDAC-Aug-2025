
import java.util.Scanner;
class TrafficSignal{

public static void trafficSignalInstruction(String trafficColor){
     
	 if(trafficColor.equalsIgnoreCase("Green")){
	 System.out.println("Go");
	 }
	 if(trafficColor.equalsIgnoreCase("Red")  ){
	 System.out.println("stop");
	 }
	 if(trafficColor.equalsIgnoreCase("Yellow")){
	 System.out.println("slow down");
	 } 

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter traffic light color: ");
String trafficColor = sc.nextLine();
trafficSignalInstruction(trafficColor);

}

}
