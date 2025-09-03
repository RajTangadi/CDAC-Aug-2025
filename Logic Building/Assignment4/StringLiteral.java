public class StringLiteral{
    public static void main(String[] args) {
        String str1 = "raj";
        String str2 = "raj";

        boolean sameObject = (str1 == str2);

        System.out.println("Both variables point to the same object: " + sameObject);
    }
}
