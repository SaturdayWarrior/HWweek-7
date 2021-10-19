import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
      /*rite a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter fist number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter a symbol to add, Subtract, multiply or divide: ");
        char a = scanner.next().charAt(0);

        if (a == '+')
            System.out.println("The answer is "+ (x+y));
        else if(a == '-')
            System.out.println("The answer is "+ (x-y));
            else if (a == '*')
            System.out.println("The answer is "+ (x*y));
            else if (a == '/')
            System.out.println("The answer is "+ (x/y));
        System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner closed");
    }
}
