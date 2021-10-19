import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        //. Write a java program that tells us that Input number is odd or even?
        // HINT: use ternary operator (? :)
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = obj.nextInt();
        String value = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + value);
        System.out.println("Closing Scanner...");
        obj.close();
        System.out.println("Scanner closed");

    }
}
