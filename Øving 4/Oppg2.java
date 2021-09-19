import klasser.Spiller;

public class Oppg2 {
    public static void main(String[] args){
        Spiller spiller1 = new Spiller();
        Spiller spiller2 = new Spiller();

        int runde = 1;

        while (!spiller1.erFerdig() && !spiller2.erFerdig()) {
            spiller1.kastTerning();
            spiller2.kastTerning();
            System.out.printf("%d. runde: \nSpiller 1: %d \nSpiller 2: %d\n\n", runde, spiller1.getPoengsum(), spiller2.getPoengsum());
            runde++;
        }
    }
    
}
