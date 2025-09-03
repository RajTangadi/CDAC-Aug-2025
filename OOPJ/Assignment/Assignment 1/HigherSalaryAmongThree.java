import java.util.Scanner;

class HigherSalaryAmongThree{

public static void higherSalary(int company1, int company2, int company3){


if(company1 >= company2 && company1 >= company3){
	System.out.println("Company 1 offer the highest salary.");
}else if(company2 >= company1 && company2 >= company3){
	System.out.println("Company 2 offer the highest salary.");
}else{
	System.out.println("Company 3 offer the highest salary.");
}	

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter salary for Company 1: ");
int company1 = sc.nextInt();

System.out.print("Enter salary for Company 2: ");
int company2 = sc.nextInt();

System.out.print("Enter salary for Company 3: ");
int company3 = sc.nextInt();

higherSalary(company1,company2,company3);



}


}