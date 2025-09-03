import java.util.*;

public class LargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] numbers = new Integer[5]; 
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = Collections.max(Arrays.asList(numbers));

        System.out.println("The largest element is: " + largest);

        sc.close();
    }
}
