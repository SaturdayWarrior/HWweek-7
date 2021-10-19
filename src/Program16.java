import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        //Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = scanner.nextDouble();
        if(num<0)
            System.out.println("The number is Negative.");//output in number
        else if (num==0)
            System.out.println("Then entered number is Zero.");//input if user enter zero then output number is zero
            else if(num>0)
                System.out.println("The entered number is Positive ");//output is positive number
            else System.out.println("Only accept number");//users can put only number they can not put symbol or any other char...
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner closed");
    }
}
