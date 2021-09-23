package Klasser;

public class Fractions {
    private int numerator;
    private int denominator;

    public Fractions(int numerator, int denominator) { //Konstruktør 1
        this.numerator = numerator;
        if(denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator has to be greater than zero.");
        }
    }

    public Fractions(int numerator) { //Konstruktør 2
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void add(Fractions b) {
        numerator = numerator * b.getDenominator() + denominator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    public void subtract(Fractions b) {
        numerator = numerator * b.getDenominator() - denominator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    public void multiply(Fractions b) {
        numerator = numerator * b.getNumerator();
        denominator = denominator * b.getDenominator();
    }

    public void divide(Fractions b) {
        numerator = numerator * b.getDenominator();
        denominator = denominator * b.getNumerator();
    }

    public void shorten() {
        for(int i = 2; i <= denominator;) {
            while(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
            break;

        }
    }

    public String toString() {
        return "Teller: " + numerator + "\nNevner: " + denominator;
    }
    
}
