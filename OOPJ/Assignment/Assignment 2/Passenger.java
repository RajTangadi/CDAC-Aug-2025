/*
Problem 6: Indian Railway Ticket Booking 
Scenario: 
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and 
age or name, age, and seat type. The system should also count the total tickets booked using a static 
counter. 
Tasks: 
1. Create a Passenger class. 
2. Implement two constructors (constructor overloading): 
Constructor 1 → Passenger(String name, int age) 
Constructor 2 → Passenger(String name, int age, String seatType) 
3. Use a static counter to keep track of total passengers booked. 
4. Print passenger details and total passengers. 
Input Example: 
Passenger1: "Ravi", 25 
Passenger2: "Anita", 30, "AC Sleeper" 
Passenger3: "Suresh", 40 
Expected Output: 
Passenger1: Name: Ravi, Age: 25, Seat: General 
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper 
Passenger3: Name: Suresh, Age: 40, Seat: General 
Total Passengers Booked: 3
*/

class Passenger{

private String name;
private int age;
//String seatType = "general";
private String seatType;
private static int totalPassengers  = 0;

public Passenger(String name, int age){
this.name = name;
this.age = age;
this.seatType = "General";
totalPassengers ++;
}

public Passenger(String name, int age, String seatType){
this.name = name;
this.age = age;
this.seatType = seatType;
totalPassengers ++;
}

public String getName(){
   return name;
}

public int getAge(){
   return age;
}

public String getSeatType(){
    return seatType;
}

public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
}

public static void showTotalPassengers() {
System.out.println("Total Passengers Booked: " + totalPassengers);
}


public static void main(String args[]){

Passenger passenger1 = new Passenger("Ravi", 25);
Passenger passenger2 = new Passenger("Anita", 30, "AC Sleeper");
Passenger passenger3 = new Passenger("Suresh", 40);

        System.out.print("Passenger1: "); passenger1.printDetails();
        System.out.print("Passenger2: "); passenger2.printDetails();
        System.out.print("Passenger3: "); passenger3.printDetails();

showTotalPassengers();
}

}