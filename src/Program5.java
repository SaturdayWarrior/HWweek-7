import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        String Employee_name;
        int Employee_id;
        float basic_salary, HRA, TA, DA, PF;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        Employee_id = obj.nextInt();
        System.out.println("Enter Employee Name: ");
        Employee_name = obj.next();
        System.out.println("Enter Basic salary: ");
        basic_salary = obj.nextInt();
         basic_salary = 25000;

        HRA = (10 * basic_salary) / 100;//HRA = basic salary 10%
        TA = (9 * basic_salary) / 100;//TA = basic salary 9%
        DA = (8 * basic_salary) / 100;//DA = basic salary 8%
        PF = (-20 * basic_salary) / 100;//PF = basic salary deduction 20%
        double salary = basic_salary + HRA + TA + DA + PF;
        System.out.println("|____________________________________|");
        System.out.println("|               Salary Slip          |");
        System.out.println("|------------------------------------|");
        System.out.println("|Employee Id   : " + Employee_id +"                  |");
        System.out.println("|Employee Name : " + Employee_name +"               |");
        System.out.println("|------------------------------------|");
        System.out.println("|HRA           : " + HRA  +"              |");
        System.out.println("|TA            : " + TA   +"              |");
        System.out.println("|DA            : " + DA   +"              |");
        System.out.println("|PF            : " + PF   +"             |");
        System.out.println("|------------------------------------|");
        System.out.println("|Gross Salary  : " + salary + "             |");
        System.out.println("|====================================|");

        System.out.println("Closing Scanner...");
        obj.close();
        System.out.println("Scanner closed");
    }
}

