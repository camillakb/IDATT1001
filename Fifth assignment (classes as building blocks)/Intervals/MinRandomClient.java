package Intervals;

/**
 * Client program for the MinRandom class.
 */

public class MinRandomClient {
    public static void main(String [] args) {
        MinRandom generator = new MinRandom();

        //Prints 15 random decimal numbers between 1.5 and 3.5.
        double startDouble = 1.5;
        double stopDouble = 3.5;
        int numberOfDoubles = 15;

        System.out.printf("\n%d random decimal numbers between %.1f and %.1f:\n", numberOfDoubles, startDouble, stopDouble);

        for (int i = 0; i < 15; i++) {
            System.out.println(generator.nextDecimal(startDouble, stopDouble));
        }

        //Prints 15 random integers between 0 and 10.
        int startInt = 0;
        int stopInt = 10;
        int numberOfIntegers = 15;

        System.out.printf("\n%d random integers between %d and %d:\n", numberOfIntegers, startInt, stopInt);

        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.println(generator.nextInteger(startInt, stopInt));
        }
    }
}
