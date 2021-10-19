import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // input any number and find out if it’s odd or even
        Scanner oddevn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = oddevn.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is even number");
        }else System.out.println(num + " is odd number");
    }

}
