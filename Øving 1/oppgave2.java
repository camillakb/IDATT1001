import static javax.swing.JOptionPane.*; 

public class oppgave2 {
    public static void main(String [] args){ 
        String timer = showInputDialog("Antall timer");
        String minutt = showInputDialog("Antall minutt");
        String sekund = showInputDialog("Antall sekund");

        int resultTimer = Integer.parseInt(timer);
        int resultMinutt = Integer.parseInt(minutt);
        int resultSekund = Integer.parseInt(sekund);

        System.out.println(timer + " timer, " + minutt + " minutter og " + sekund + " sekunder er det samme som " + (resultTimer * 3600+ resultMinutt * 60 + resultSekund + " sekunder."));
}
}
    
    
