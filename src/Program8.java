import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        /*IInput any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/
        char alphabet;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter City Name: ");
        alphabet = scn.next().charAt(0);

        if (alphabet == 'a'||alphabet=='A') {
            System.out.println("Ahmedabad");
        } else if (alphabet == 'b' || alphabet == 'B') {
            System.out.println("Bombay");
        } else if (alphabet == 'c'|| alphabet=='C') {
            System.out.println("Chennai");
        } else if (alphabet == 'd' || alphabet =='D') {
            System.out.println("Delhi");
        } else if (alphabet == 'e'|| alphabet =='E') {
            System.out.println("El_paso");
        }else if (alphabet == 'f' || alphabet == 'F'){
            System.out.println("Florida");
        }else{
            System.out.println("Enter alphabet from A to F only.");
        }
        System.out.println("Closing Scanner...");
        scn.close();
        System.out.println("Scanner closed");
    }
}