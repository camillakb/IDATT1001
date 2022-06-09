import javax.swing.JOptionPane;

/**
 * Client program that converts inches to centimetres.
 */

class InchesToCentimetres {
    public static void main(String [] args){
      String inches = JOptionPane.showInputDialog("Enter inches:");

      double result = Double.parseDouble(inches);

      System.out.println(inches + " inches is the same as " + result*2.54 + " cm");
    }
}