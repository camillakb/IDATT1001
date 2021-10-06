package Klasser;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class TekstBehandling {
    private String text;
    
    public TekstBehandling(String inputString) { //Konstruktør
        if(inputString != null) {
            text = inputString;

        } else {
            throw new IllegalArgumentException("Skriv inn en tekst");
        }
    }
    private String[] getWords(String inputText) { //Finner ordene.
        String[] splitString = inputText.split("[\\s,;:!?_-]+");  //String splittes ved tegnsetting og mellomrom.
        ArrayList<String> newStrings = new ArrayList<>();

        for(String subString : splitString) {
            if(!subString.matches("([a-zA-ZæøåÆØÅ][.]){2,}")) { //Sjekker at subString ikke er et akronym med punktum mellom bokstavene.
                String dotLessString = subString.replace(".", ""); //Fjerner punktum som ikke skal være med.
                newStrings.add(dotLessString);

            } else {
                newStrings.add(subString);
            }
        }
        return newStrings.toArray(new String[0]);
    }
    
    private String[] getPeriods() { //Finner periodene.
        return text.split("[.!:?]");
    }

    public int wordCount() { 
        return getWords(text).length;
    }

    public int wordCount(String inputText) { //Finne antall ord
        return getWords(inputText).length;
    }

    public double getAverageLength() { //Finne gjennomsnittlig ordlengde (mellomrom teller ikke).
        String[] words = getWords(text); 

        int i = 0;
        double wordLengthSum = 0;

        for(String word : words) {
            wordLengthSum += word.length();
            i++;
        }
        return wordLengthSum / i;
    }

    public double getAverageWordPerPeriod() { //Finne gjennomsnittlig antall ord per periode (periode skilles ved . ! : eller ?)
        String[] periods = getPeriods();

        int i = 0;
        double wordCountSum = 0;

        for(String period : periods) {
            wordCountSum += wordCount(period);
            i++;
        }

        return wordCountSum / i;
    }

    public void replaceWord(String target, String replacementString) { //Skifte ut ett ord med et annet gjennom hele teksten
        text = text.replaceAll("(?i)(?<=\\s)" + Pattern.quote(target) + "(?=[\\s,.!?;:])", replacementString);
    }

    public String getText() { //Hente teksten slik den står, uten endringer
        return text;
    }

    public String getUppercaseText() { //Hente ut teksten, men alle bokstavene er store
        return text.toUpperCase();
    }

    @Override
    public String toString() {
        return text;
    }
}