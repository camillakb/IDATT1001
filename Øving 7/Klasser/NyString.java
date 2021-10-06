package Klasser;
import java.util.ArrayList; 

public class NyString {
    private final String string;

    public NyString(String inputString) {
        if(inputString != null) {
            string = inputString;

        } else {
            throw new IllegalArgumentException("NyString kan ikke være tom.");
        }
    }

    public String getAcronym() { //Hent ord (skilles ved mellomrom, komma, punktum osv).
        String[] words = getWords();

        StringBuilder acronym = new StringBuilder();

        for(String word : words) {
            acronym.append(word.charAt(0)).append(".");
        }

        return acronym.toString();
    }

    public String removeChar(String charRemoved) { //Bokstav eller tegn som skal fjernes.
        String[] tempStrings = string.split(charRemoved); //String deles opp og fjerner alle charRemoved

        StringBuilder newString = new StringBuilder();

        for(String element : tempStrings) { //Setter sammen stringen igjen uten charRemoved
            newString.append(element);
        }

        return newString.toString();
    }

    private String[] getWords() {
        String[] splitString = string.split("[\\s,;:!?_-]+");  //String splittes ved tegnsetting og mellomrom.
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
}
