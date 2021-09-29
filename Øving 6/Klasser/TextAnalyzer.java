package Klasser;
import java.util.Arrays;


public class TextAnalyzer {
    private int[] array;
    public char[] getFlestAv;

    public TextAnalyzer(int[] a) {
        this.array = a;
    }
    public int  getAntallUlikeBokstaver() {
        int antall = 0;
        for(int i = 0; i < this.array.length - 1; i++) {
            if(this.array[i] != 0) {
                antall ++;
            }

        } return antall;
    }

    public int getAntallBokstaver() {
        int antall = 0;
        for(int i = 0; i < this.array.length - 1; i++) {
            if(this.array[i] != 0) {
                antall += this.array[i];
            }

        } return antall;
    }

    public double getProsentIkkeBokstav() {
        double antall = 0;
        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] != 0) {
                antall += this.array[i];
            }
        }

        double tegn = this.array[29];
        double prosent = ((tegn / antall) * 100);
        return prosent;
    }

    public int getBokstav(char a) {
        char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int plass = 0;

        for(int i = 0; i < alfabet.length; i++) {
            if(alfabet[i] == a) {
                plass = i;
            }

        } return this.array[plass];
    }
    public String getBokstav(String string) {
        return null;
    }

    public String getFlestAv() {
        char[] alfabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int[] storstArr = new int[]{};
        char[] flestArr = new char []{};
        int plass = 0;
        int storst = 0;
        String skrivUt = "Det er flest av bokstavene ";

        for(int i = 0; i < this.array.length - 1; i++) { //sjekker hvilken verdi som har størst verdi og lagrer den
            if(this.array[i] > storst) {
                storst = this.array[i];
            }
        }

        for(int i = 0; i < this.array.length - 1; i++) { //finner ut om det er andre verdier som er like store som storst og legger de til i en array som jeg kaller storstArr
            if(this.array[i] == storst) {
                storstArr = Arrays.copyOf(storstArr, storstArr.length + 1);
                storstArr[plass] = i;
                plass++;
            }
        }

        for(int i = 0; i < storstArr.length; i++) { //lager en flestArr av typen char for å kunne printe ut bokstavene og legger inn de evt verdiene som er storst
            flestArr = Arrays.copyOf(flestArr, flestArr.length +1);
            flestArr[i] = alfabet[storstArr[i]];
        }

        for(int i = 0; i < flestArr.length; i++) { //legger til verdiene i stringen skrivUt
            skrivUt += flestArr[i] + "";
        
        } return skrivUt;
    }
    
}

