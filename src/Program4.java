import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = obj.nextInt();
        System.out.println("Enter Month: ");
        int month = obj.nextInt();

        isLeapYear(year);
        getDaysInMonth(month, year);
    }/* Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year*/
    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
        }
        if (leap) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");
        if (year <= 1 && year >= 9999) {
            System.out.println("Parameter is not in Range");
        }
        return leap;
    }
    boolean leap;
    public static void getDaysInMonth(int month, int year) {
        /*getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 9999*/
        int day = 365;
        switch (month) {
            case 1:
                System.out.println("31 days in this month ");//january
                break;
            case 2:
                if (isLeapYear(year)) {
                    System.out.println("29 days in this month ");
                    break;
                } else {
                    System.out.println("28 days in this month ");
                    break;
                }
            default:
                System.out.println("Enter valid number");
            case 3:
                System.out.println("31 days in this month ");
                break;
            case 4:
                System.out.println("30 days in this month ");
                break;
            case 5:
                System.out.println("31 days in this month ");
                break;
            case 6:
                System.out.println("30 days in this month ");
                break;
            case 7:
                System.out.println("31 days in this month ");
                break;
            case 8:
                System.out.println("31 days in this month ");
                break;
            case 9:
                System.out.println("30 days in this month ");
                break;
            case 10:
                System.out.println("31 days in this month ");
                break;
            case 11:
                System.out.println("30 days in this month ");
                break;
            case 12:
                System.out.println("31 days in this month ");
        }
        if (year < 1 && year > 9999) {
            System.out.println("-1");
        }
    }
}

