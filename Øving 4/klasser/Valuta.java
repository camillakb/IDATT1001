package klasser;

public class Valuta {
    private double kronerPer; 
    private String navn;

    public Valuta(String navn, double perKrone) {
        this.navn = navn;
        this.kronerPer = perKrone;
    }

    public double fraNOK(double antallKroner) {
        return antallKroner / this.kronerPer;
    }

    public double tilNOK(double antall) {
        return antall * this.kronerPer;
    }

    public String hentNavn() {
        return this.navn;
    }
}
