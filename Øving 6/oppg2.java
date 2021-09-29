import java.util.Scanner;
import Klasser.TextAnalyzer;

public class oppg2 {
    public static void main(String [] args) {
        boolean fortsett = true;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Skriv inn en tekst.");
            String tekst = sc.nextLine().toLowerCase();
            char[] tekstArr = tekst.toCharArray();

            char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();

            int[] antallTegn = new int[30];

            for(int i = 0; i < tekstArr.length; i++) {
                for(int k = 0; k < alfabet.length; k++) {
                    if(tekstArr[i] == alfabet[k]){
                        antallTegn[k]++;
                    }
                }

                if(Character.isLetter(tekstArr[i]) == false) {
                    antallTegn[29]++;
                }
            }

            TextAnalyzer t1 = new TextAnalyzer(antallTegn);
            System.out.println("Antall forskjellige bokstaver er: " + t1.getAntallUlikeBokstaver());
            System.out.println("Totalt antall bokstaver er: " + t1.getAntallBokstaver());
            System.out.println("Prosentandelen av teksten som ikke er bokstaver: " + t1.getProsentIkkeBokstav() + "%");
            System.out.println("Antall forekomster av bokstaven c er: " + t1.getBokstav('c'));
            System.out.println(t1.getFlestAv());
        } while (fortsett == true); //går ikke i loop - fiks
        sc.close();
    }

}
   