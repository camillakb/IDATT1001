package FractionsCalculator;
import  javax.swing.JOptionPane;

/**
 * Client that allows the user to perform calculations with fractions.
 */

public class FractionsCalculatorClient {
    public static void main(String[] args) {

        //Opens JOptionPane window that asks the user for the numerator and denominator of the first fraction.
        String numeratorRead = JOptionPane.showInputDialog("Please enter the desired values for the first fraction.\nNumerator: ");
        int numerator = Integer.parseInt(numeratorRead);
        String denominatorRead = JOptionPane.showInputDialog("Denominator: ");
        int denominator = Integer.parseInt(denominatorRead);

        Fractions fraction1 = new Fractions(numerator, denominator);

        //Asks the user for the numerator and denominator of the second fraction.
        String numerator2Read = JOptionPane.showInputDialog("Please enter the desired values for the second fraction.\nNumerator: ");
        int numerator2 = Integer.parseInt(numerator2Read);
        String denominator2Read = JOptionPane.showInputDialog("Denominator: ");
        int denominator2 = Integer.parseInt(denominator2Read);

        Fractions fraction2 = new Fractions(numerator2, denominator2);

        //Asks the user for the desired action.
        String operationRead = JOptionPane.showInputDialog("Choose action:\n 1. Sum\n2. Subtract\n3. Divide\n4. Multiply\n5. Quit");
        int operation = Integer.parseInt(operationRead);

        //Notifies the user if the input is invalid.
        if (operation < 1 || operation > 5) {
            System.out.println("Invalid choice.");

        //Adds the fractions.
        } else if (operation == 1) {
            fraction1.add(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());

        //Subtracts the fractions.
        } else if (operation == 2) {
            fraction1.subtract(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        //Divides the fractions.
        else if (operation == 3) {
            fraction1.divide(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        //Multiplies the fractions.
        else if (operation == 4) {
            fraction1.multiply(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        else if (operation == 5) {
            System.out.println("Bye!");
        }
    }
}