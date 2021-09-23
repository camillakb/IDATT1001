import Klasser.Fractions;
import  javax.swing.JOptionPane;

public class oppg1 {
    public static void main(String[] args) {
        String numeratorRead = JOptionPane.showInputDialog("Teller: ");
        int numerator = Integer.parseInt(numeratorRead);
        String denominatorRead = JOptionPane.showInputDialog("Nevner: ");
        int denominator = Integer.parseInt(denominatorRead);

        Fractions fraction1 = new Fractions(numerator, denominator);

        String numerator2Read = JOptionPane.showInputDialog("Teller 2: ");
        int numerator2 = Integer.parseInt(numerator2Read);
        String denominator2Read = JOptionPane.showInputDialog("Nevner 2: ");
        int denominator2 = Integer.parseInt(denominator2Read);

        Fractions fraction2 = new Fractions(numerator2, denominator2);

        String operationRead = JOptionPane.showInputDialog("Velg regnemåte:\n 1. Summere\n2. Subtrahere\n3. Dividere\n4. Multiplisere\n5. Avslutte");
        int operation = Integer.parseInt(operationRead);

        if(operation < 1 || operation > 5) {
            System.out.println("Ugyldig regnemåte.");

        } else if(operation == 1) {
            fraction1.add(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());

        } else if(operation == 2) {
            fraction1.subtract(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        else if(operation == 3) {
            fraction1.divide(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        else if(operation == 4) {
            fraction1.multiply(fraction2);
            fraction1.shorten();
            System.out.println(fraction1.toString());
        }

        else if(operation == 5) {
            System.out.println("Hadet bra!");
        }
    }
}