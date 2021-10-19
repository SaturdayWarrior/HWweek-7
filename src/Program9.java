import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        //switch method
        /*Same as above program-8 using switch statement.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet to get its city name: ");
        char city = scanner.next().charAt(0);
        if (city == 'A') {
            System.out.println("city name is Ahmedabad.");

        } else {
            switch (city) {
                case 'B':
                    System.out.println("The city name is Bombay.");
                    break;
                case 'C':
                    System.out.println("The city name is Chennai.");
                    break;
                case 'D':
                    System.out.println("The city name is Delhi.");
                    break;
                case 'E':
                    System.out.println("The city name is El_paso.");
                    break;
                case 'F':
                    System.out.println("The city name is Florida.");
            }

        } System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner closed");
    }

}
