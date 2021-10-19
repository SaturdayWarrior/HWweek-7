import java.util.Arrays;

public class Program19 {
    public static void main(String[] args) {
            // calculate the average value of array elements.
            int []value = {10,20,30,40};
            System.out.println("Given value in array are: "+ Arrays.toString(value));

            //declaring sum variable
            int sum=0;
            //calculating total of value in arry
            for (int i = 0; i < value.length; i++){
                sum = sum + value[i];

            }
            System.out.println("the sum of all the value in the given array is: "+ sum);
            //calculating avg
        double avg = sum/value.length;
        System.out.println("The average of all the given values in the arrys is: "+avg);
        }
    }

