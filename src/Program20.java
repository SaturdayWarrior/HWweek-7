import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        //test if an array contains a specific value.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to find in the array: ");
        int find = scanner.nextInt();
        int [] array = {10,20,30,40};
        boolean get = false;
        for (int n : array){
            if (n==find){
                get = true;

            }
        }if (get) System.out.println(find+ " is Found");
        else System.out.println(find+ " is not Found");
    }
}
