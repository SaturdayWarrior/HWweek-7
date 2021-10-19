import java.util.Arrays;

public class Program18 {
    public static void main(String[] args) {
        // program to sum values of an array.
        int []value = {10,20,30,40};
        System.out.println("Given value in array are: "+ Arrays.toString(value));
        //declaring sum variable
        int sum=0;
        //calculating total of value in arry
        for (int i = 0; i < value.length; i++){
            sum = sum + value[i];

        }
        System.out.println("the sum of all the value in the given array is: "+ sum);
    }
}
