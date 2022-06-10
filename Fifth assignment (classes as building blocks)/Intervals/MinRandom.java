package Intervals;

import java.util.Random;

/**
 * Class for generating intervals between given integers or decimals.
 */

public class MinRandom {
    private Random memberGenerator;

    /**
     * Simple constructor that initializes a Random object.
     */
    public MinRandom() {
        this.memberGenerator = new Random();
    }

    /**
     * Method to get integers between startInt and stopInt.
     * @param startInt an integer that is the start value.
     * @param stopInt an integer that is the end value.
     * @return an interval of integers between startInt and stopInt.
     */
    public int nextInteger(int startInt, int stopInt) {
        return memberGenerator.nextInt((stopInt + 1) - startInt) + startInt;
    }

    /**
     * Method to get decimal numbers between startInt and stopInt.
     * @param startDouble a double that is the start value.
     * @param stopDouble a double that is the start value.
     * @return an interval of decimal numbers between startDouble and stopDouble.
     */
    public double nextDecimal(double startDouble, double stopDouble) {
        return memberGenerator.nextDouble() * (stopDouble - startDouble) + startDouble;
    }
}
