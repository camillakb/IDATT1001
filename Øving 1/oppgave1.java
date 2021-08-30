import javax.swing.JOptionPane;

class Oppgave1 {
    public static void main(String [] args){
      String tommer = JOptionPane.showInputDialog("Antall tommer");

      double result = Double.parseDouble(tommer);

      System.out.println(tommer + " tommer er det samme som " + result*2.54 + " cm");
    }
}