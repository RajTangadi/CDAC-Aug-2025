/*
Problem 19:  Vehicle Registration – Static Block 
Scenario: 
Add a static block to Vehicle class: 
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads 
● Verify that the message prints only once when multiple vehicles are created
*/

class Vehicle1 {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 1;

    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    public Vehicle1(String ownerName, String vehicleType) {
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
        Vehicle1 v1 = new Vehicle1("Raj", "Car");
        Vehicle1 v2 = new Vehicle1("Ritesh", "Truck");

        System.out.println("RegNo: " + v1.getRegNo() + ", Owner: " + v1.getOwnerName() + ", Type: " + v1.getVehicleType());
        System.out.println("RegNo: " + v2.getRegNo() + ", Owner: " + v2.getOwnerName() + ", Type: " + v2.getVehicleType());
    }
}
