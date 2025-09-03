/*
Problem 18:  Vehicle Registration – Static Counter 
Scenario: 
Create Vehicle class with regNo, ownerName, vehicleType. 
● Static variable: vehicleCount 
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount 
C-DAC MUMBAI
 ● Getter methods for all fields 
● Create 2 vehicles, display registration details
*/

class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 1;

    public Vehicle(String ownerName, String vehicleType) {
        this.regNo = "MH-2025-" + vehicleCount++;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Raj", "Car");
        Vehicle v2 = new Vehicle("Nihal", "Bike");

        System.out.println("RegNo: " + v1.getRegNo() + ", Owner: " + v1.getOwnerName() + ", Type: " + v1.getVehicleType());
        System.out.println("RegNo: " + v2.getRegNo() + ", Owner: " + v2.getOwnerName() + ", Type: " + v2.getVehicleType());
    }
}
