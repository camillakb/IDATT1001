import javax.swing.JOptionPane;

public class Oppgave3 {
    public static void main(String [] args){
        String sekundLest = JOptionPane.showInputDialog("Antall sekunder");
        int sekund = Integer.parseInt(sekundLest);
        int timer = (sekund / 3600);
        int minutt = ((sekund % 3600)/60);
        int sluttSekund = (sekund % 60);

        if(timer==1){
            System.out.println(sekundLest + " er det samme som " + timer + " time, " + minutt + " minutt, " + sluttSekund + " sekund.");
        } else {
            System.out.println(sekundLest + " sekunder er det samme som " + timer + " timer, " + minutt + " minutter og " + sluttSekund + " sekunder.");
        }
        }
    }
    
