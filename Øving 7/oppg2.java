import Klasser.TekstBehandling;
public class oppg2 {

    public static void main(String[] args) {
        
        String testString = "Hei! I denne teksten har jeg fått et skrivefeil. Denne skrivefeilen er et vanlig tabbe når man ikke følger med.";

        String searchString = "et";
        String replacementString = "en";

        TekstBehandling test = new TekstBehandling(testString);

        System.out.println("Antall ord i teksten: " + test.wordCount() + "\n");
        System.out.println("Gjennomsnittlig ordlengde: " + test.getAverageLength() + "\n");
        System.out.println("Gjennomsnittlig antall ord per periode: " + test.getAverageWordPerPeriod() + "\n");
        System.out.println("Teksten med utskiftede ord: "); 
        test.replaceWord(searchString, replacementString);
        System.out.println("\n" + test + "\n");
        System.out.println("Den originale teksten: " + testString + "\n");
        System.out.println("Teksten med kun store bokstaver: " + test.getUppercaseText());
    }
}
