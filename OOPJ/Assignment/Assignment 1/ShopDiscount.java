import java.util.Scanner;
class ShopDiscount {

public static void shopDiscount(double purchaseAmount){

    double finalCost;
    if (purchaseAmount > 1000) {
            finalCost = purchaseAmount - (purchaseAmount * 0.10); 
        } else {
            finalCost = purchaseAmount;
        }
		
		System.out.println("Final cost after discount: " + finalCost);

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

   System.out.print("Enter total purchase amount: ");
   double purchaseAmount = sc.nextDouble();

   shopDiscount(purchaseAmount);

}

}