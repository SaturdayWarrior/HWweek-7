import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // Write a java program to input any year like (ex.2007) and find out if it is leap year or
        //not?
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = obj.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
        } else if (year % 1 != 0 && year % 4 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear == true) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(" is not Leap year");

        }System.out.println("Closing Scanner...");
        obj.close();
        System.out.println("Scanner closed");
    }
}
