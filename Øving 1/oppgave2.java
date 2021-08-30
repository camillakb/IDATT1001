import javax.swing.JOptionPane; 

public class Oppgave2 {
    public static void main(String [] args){ 
        String timer = JOptionPane.showInputDialog("Antall timer");
        String minutt = JOptionPane.showInputDialog("Antall minutt");
        String sekund = JOptionPane.showInputDialog("Antall sekund");

        int resultTimer = Integer.parseInt(timer);
        int resultMinutt = Integer.parseInt(minutt);
        int resultSekund = Integer.parseInt(sekund);

        System.out.println(timer + " timer, " + minutt + " minutter og " + sekund + " sekunder er det samme som " + (resultTimer * 3600+ resultMinutt * 60 + resultSekund + " sekunder."));
}
}
    
    
