package FractionsCalculator;

/**
 * Class for fractions with relevant methods for calculations.
 */

public class Fractions {
    private int numerator;
    private int denominator;

    /**
     * Simple constructor that initializes a fraction with a numerator and denominator.
     * @param numerator the fraction's numerator.
     * @param denominator the fraction's denominator.
     */
    public Fractions(int numerator, int denominator) { 
        this.numerator = numerator;
        
        if (denominator != 0) {
            this.denominator = denominator;
        
        } else {
            throw new IllegalArgumentException("Denominator has to be greater than zero.");
        }
    }

    /**
     * Constructor that initializes a fraction with a denominator automatically set to 1.
     * @param numerator the fraction's numerator.
     */
    public Fractions(int numerator) { 
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    /**
     * Get-method for the fraction's denominator.
     * @return the fraction's denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Get-method for the fraction's numerator.
     * @return the fraction's numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Method to add a fraction to another.
     * @param b the fraction that will be added.
     */
    public void add(Fractions b) {
        numerator = numerator * b.getDenominator() + denominator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    /**
     * Method to subtract a fraction from another.
     * @param b the fraction that will be subtracted from another.
     */
    public void subtract(Fractions b) {
        numerator = numerator * b.getDenominator() - denominator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    /**
     * Method to multiply a fraction to another.
     * @param b the fraction that will be multiplied to another.
     */
    public void multiply(Fractions b) {
        numerator = numerator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    /**
     * Method to divide a fraction by another.
     * @param b the fraction that another fraction will be divided by.
     */
    public void divide(Fractions b) {
        numerator = numerator * b.getDenominator();
        denominator = denominator * b.getNumerator();
    }

    /**
     * Method to simplify the fraction.
     */
    public void shorten() {
        for (int i = 2; i <= denominator;) {
            while(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
            break;
        }
    }

    /**
     * toString for the fraction.
     */
    public String toString() {
        return "Numerator: " + numerator + "\nDenominator: " + denominator;
    } 
}
