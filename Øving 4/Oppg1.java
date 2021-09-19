import klasser.Valuta;
import java.util.Scanner; 

class Oppg1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Valuta dollar = new Valuta("Dollar", 8.71);
        Valuta euro = new Valuta("Euro", 10.21);
        Valuta sek = new Valuta("Svenske kroner", 1.0028);

        Valuta[] valutaer = {dollar, euro, sek};

        while(true){
            System.out.println("Hvilken valuta vil du konvertere?");        
            
            for (int i = 0; i < valutaer.length; i++) {
                System.out.printf("%d: %s\n", i+1, valutaer[i].hentNavn());
            }
            System.out.println("4: Avslutt");

            int valg = input.nextInt();

            if(valg == 4){
                System.out.println("Hadet bra!");
                input.close();
                return;
            }
            
            System.out.println("Hvilket beløp vil du konvertere?");
            double beløp = input.nextDouble();

            double nyttBeløp = valutaer[valg - 1].tilNOK(beløp);
            System.out.printf("%.2f %s er %.2f kroner\n", beløp, valutaer[valg - 1].hentNavn(), nyttBeløp);
        }
    }
}