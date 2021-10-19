import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        // Write a Java program to sort a numeric array and a string array.
        int[]points = {41,42,43,44,45};
        String[] game = {"Volleyball, Cricket, Pinball, Football, WWF "};

        System.out.println("Given Point: "+ Arrays.toString(points));
        Arrays.sort(points);
        System.out.println("Sorted Point "+ Arrays.toString(points));

        System.out.println("Given Game names: "+ Arrays.toString(game));
        Arrays.sort(game);
        System.out.println("Sorted Game names: "+ Arrays.toString(game));


    }
}
