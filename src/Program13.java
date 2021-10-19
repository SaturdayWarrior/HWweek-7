import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        /*. Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");//day 1 = Monday
                break;
            case  2:
                System.out.println("Tuesday");//da 2 = Tuesday
                break;
            case  3:
                System.out.println("Wednesday");//day 3 = Wednesday
                break;
            case  4:
                System.out.println("Thursday");//day 4 = Thursday
                break;
            case  5:
                System.out.println("Friday");//day 5 = Friday
                break;
            case  6:
                System.out.println("Saturday");//day 6 = Saturday
                break;
            case  7:
                System.out.println("Sunday");//day 7 = Sunday
                break;
            default:
                System.out.println("Week contains 1 tp 7 days.");
        }
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner closed");
    }
}
