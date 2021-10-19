import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        /* input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
        String seller_name;
        double sales_id, sales_amount, salary_basic, sales;
        double sales_commission;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter seller name: ");
        seller_name = obj.nextLine();
        System.out.println("Enter sales id: ");
        sales_id = obj.nextInt();
        System.out.println("Enter sales amount: ");
        sales_amount = obj.nextInt();
        System.out.println("Enter basic salary: ");
        salary_basic = obj.nextInt();

        if (sales_amount >= 50000)
            sales_commission = 0.35;
        else if (sales_amount >= 30000 && sales_amount < 50000) {
            sales_commission = 0.20;
        } else if (sales_amount >= 20000 && sales_amount < 30000) {
            sales_commission = 0.10;
        } else if (sales_amount >= 10000 && sales_amount < 20000) {
            sales_commission = 0.05;
        } else
            sales_commission = 0.02;
        sales = (sales_commission*sales_amount);
        System.out.println("seller Commission rate is "+sales_commission + " and commission amount "+ sales);


        System.out.println("Closing Scanner...");
        obj.close();
        System.out.println("Scanner closed");
        }
    }

