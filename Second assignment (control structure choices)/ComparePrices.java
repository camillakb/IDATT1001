import javax.swing.JOptionPane;

/**
 * Client that checks which one of two products is cheaper by comparing their prices and weights.
 */

public class ComparePrices {
    public static void main(String [] args){
        String inputPriceA = JOptionPane.showInputDialog("Product A's price:");
        String inputWeightA = JOptionPane.showInputDialog("Product A's weight in kg:");
        String inputPriceB = JOptionPane.showInputDialog("Product B's price:");
        String inputWeightB = JOptionPane.showInputDialog("Product B's weight in kg:");

        double priceA = Double.parseDouble(inputPriceA);
        double weightA = Double.parseDouble(inputWeightA);
        double priceB = Double.parseDouble(inputPriceB);
        double weightB = Double.parseDouble(inputWeightB);

        if(priceA / weightA > priceB / weightB){
            System.out.println("Product B is cheaper.");
        
        } else{
            System.out.println("Product A is cheaper.");
        }
    } 
}
