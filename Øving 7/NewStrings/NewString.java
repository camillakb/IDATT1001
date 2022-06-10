package NewStrings;
import java.util.ArrayList; 

/**
 * Class to initialize a String object with relevant methods to edit the string.
 */

public class NewString {
    private final String string;

    /**
     * Simple constructor that initializes a String object.
     * @param inputString the string value that belongs to the object.
     */
    public NewString(String inputString) {
        if (inputString != null) {
            string = inputString;

        } else {
            throw new IllegalArgumentException("String can't be empty.");
        }
    }

    /**
     * Method to create an acronym for the String.
     * @return an acronym made from the string.
     */
    public String getAcronym() { 
        String[] words = getWords();

        StringBuilder acronym = new StringBuilder();

        for(String word : words) {
            acronym.append(word.charAt(0)).append(".");
        }

        return acronym.toString();
    }

    /**
     * Method to remove a letter or another character by choice.
     * @param charRemoved the character that should be removed.
     * @return a new string where the chosen character is removed.
     */
    public String removeChar(String charRemoved) { 
        String[] tempStrings = string.split(charRemoved); 
        StringBuilder newString = new StringBuilder();

        for (String element : tempStrings) { 
            newString.append(element);
        }

        return newString.toString();
    }

    /**
     * Method to get the individual words from the string.
     * @return an array of the words in the string.
     */
    private String[] getWords() {
        //Splitting the string using symbols and spaces.
        String[] splitString = string.split("[\\s,;:!?_-]+"); 
        ArrayList<String> newStrings = new ArrayList<>();

        for(String subString : splitString) {
            //Checking that subString is not an acronym with periods between the letters.
            if (!subString.matches("([a-zA-ZæøåÆØÅ][.]){2,}")) { 
                //Removing periods that should not be included.
                String dotLessString = subString.replace(".", ""); 
                newStrings.add(dotLessString);

            } else {
                newStrings.add(subString);
            }
        }
        return newStrings.toArray(new String[0]);
    }
}
