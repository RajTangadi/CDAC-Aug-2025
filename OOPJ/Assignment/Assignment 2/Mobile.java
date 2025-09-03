/*
Problem 2: Simple Mobile Tracker 
Scenario: A shop wants to count how many mobiles are added to their inventory. 
Requirements: 
1. Create a class Mobile with instance variable: model (String). 
2. Create a static variable totalMobiles to count total mobiles added. 
3. Constructor should initialize model and increment totalMobiles. 
4. Create a getter for model. 
5. Create a static method showTotalMobiles() to print total mobiles. 
Input Example: 
Mobile1: model = "Samsung Galaxy M32" 
Mobile2: model = "Redmi Note 12" 
Expected Output: 
Mobile1 model: Samsung Galaxy M32 
Mobile2 model: Redmi Note 12 
Total mobiles in stock: 2 
*/


class Mobile{

 String model;
 static int totalMobiles=0;

 Mobile(String model){
 this.model = model;
 totalMobiles++;
 }

String getModel(){
return model;
}

static void showTotalMobiles(){
System.out.println("Total mobiles in stock: " + totalMobiles);
}

public static void main(String args[]){

Mobile model1 =  new Mobile("Samsung Galaxy M32");
Mobile model2 =  new Mobile("Redmi Note 12");
System.out.println("Mobile1 model: " + model1.getModel()); 
System.out.println("Mobile1 model: " + model2.getModel());
showTotalMobiles();

 }

}