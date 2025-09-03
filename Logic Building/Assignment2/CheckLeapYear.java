public class CheckLeapYear{
    public static void main(String[] args) {

        int[] years = {2024, 1997, 2008, 2015};

        for (int year : years) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
