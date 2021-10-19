import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        //Write a program that tells us input value is number or an alphabet or symbol.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value / character: ");
        char value = scanner.next().charAt(0);

        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
            System.out.println(value + " is an Alphabet.");//input value in alphabet
        } else if (value >= 1 && value <= 9) {
            System.out.println(value + " is a digit or a number.");//input value in number
        }else {
            System.out.println(value+" is a Symbol");//input value is an symbol
        }System.out.println("Closing Scanner...");
        scanner.close();
        System.out.println("Scanner closed");
    }
}
