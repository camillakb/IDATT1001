import javax.swing.JOptionPane;

public class Oppgave2 {
    public static void main(String [] args){
        String inputPrisA = JOptionPane.showInputDialog("Pris A");
        String inputVektA = JOptionPane.showInputDialog("Vekt i kg for merke A");
        String inputPrisB = JOptionPane.showInputDialog("Pris B");
        String inputVektB = JOptionPane.showInputDialog("Vekt i kg for merke B");

        double prisA = Double.parseDouble(inputPrisA);
        double vektA = Double.parseDouble(inputVektA);
        double prisB = Double.parseDouble(inputPrisB);
        double vektB = Double.parseDouble(inputVektB);

        if(prisA / vektA > prisB / vektB){
            System.out.println("Merke B er billigst.");
        } else{
            System.out.println("Merke A er billigst.");
        }

        
    }
    
}
