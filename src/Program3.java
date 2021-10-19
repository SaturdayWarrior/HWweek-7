import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        String name = null;
        int roll, math,  Science, english;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = obj.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = obj.nextInt();
        System.out.print("Enter marks in Maths: ");
        math = obj.nextInt();
        System.out.print("Enter marks in  Science: ");
        Science = obj.nextInt();
        System.out.print("Enter marks in English: ");
        english = obj.nextInt();

        int total = math +  Science + english;
        float a = (float) total / 300 * 100;

        System.out.println("----------------------------------");
        System.out.println("|       Name      : " + name + "          |");
        System.out.println("|       Roll.no   : " + roll + "          |");
        System.out.println("|       Subject        Marks    |");
        System.out.println("|       Maths     : " + math + "          |");
        System.out.println("|       Science   : " +  Science + "          |");
        System.out.println("|       English   : " + english + "          |");
        System.out.println("|       Total     : " + total + "          |");
        System.out.println("|       Percentage: " + a + "      |");

        int marks =0;
        if (math <35 || Science < 35 || english <35){
            System.out.println("        Result : Fail      |");
            System.out.println("|       Grad ---           |");
        }
        else if (marks < 0 || marks > 100) {
            System.out.println("Wrong entry");
        } else if (a >= 80) {
            System.out.println("|       Result : Pass          |");
            System.out.println("|       Grad A+                |");
        } else if (a < 80 && a >= 60) {
            System.out.println("|       Result : Pass          |");
            System.out.println("|       Grad A                 |");
        } else if (a < 60 && a >= 50) {
            System.out.println("|       Result : Pass          |");
            System.out.println("|       Grad B                 |");
        } else if (marks < 50 && marks >= 35) {
            System.out.println("|       Result : Pass          |");
            System.out.println("|       Grad C                 |");
        } else{
            System.out.println("|      Result  Pass            |");
        }System.out.println("Closing Scanner...");
        obj.close();
        System.out.println("Scanner closed");

    }

}


