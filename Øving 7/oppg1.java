import Klasser.NyString;

public class oppg1 {
    public static void main(String [] args) {
        String testString = "Dette er en test String for oppgave 1.";

        NyString test = new NyString(testString);

        System.out.println(test.getAcronym());
        System.out.println(test.removeChar("t"));
    }
}