package StringEditor;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Class for simple string editing.
 */

public class StringEdit {
    private String originalString;
    
    /**
     * Simple constructor to initialize a string object.
     * @param inputString the string that belongs to the object.
     */
    public StringEdit(String inputString) { 
        if (inputString != null) {
            originalString = inputString;

        } else {
            throw new IllegalArgumentException("String can not be empty.");
        }
    }

    /**
     * Method to get the individual words in the string.
     * @param inputString the string that should be split into individual words.
     * @return an array of the words from the initial string (inputString).
     */
    private String[] getWords(String inputString) { 
        //Finding the individual words by using symbols and spaces.
        String[] splitString = inputString.split("[\\s,;:!?_-]+"); 
        ArrayList<String> newStrings = new ArrayList<>();

        for(String subString : splitString) {
            //Checking that subString is not an acronym with periods between the letters.
            if (!subString.matches("([a-zA-ZæøåÆØÅ][.]){2,}")) { 
                //Removing the periods that should not be included.
                String dotLessString = subString.replace(".", ""); 
                newStrings.add(dotLessString);

            } else {
                newStrings.add(subString);
            }
        }
        return newStrings.toArray(new String[0]);
    }
    
    /**
     * Method to find the sentences.
     * @return the sentences in the string.
     */
    private String[] getSentences() {
        return originalString.split("[.!:?]");
    }

    /**
     * Method to find the total amount of words in the string.
     * @return the amount of words in the string.
     */
    public int wordCount() { 
        return getWords(originalString).length;
    }

    /**
     * Method to find the amount of words in a string with an input parameter.
     * @param inputString the string to find the word count for.
     * @return the amount of words in the string.
     */
    public int wordCount(String inputString) { 
        return getWords(inputString).length;
    }

    /**
     * Method to find the average number of letters in a word in a string.
     * @return the average number of letters in a word in a string.
     */
    public double getAverageLength() { 
        String[] words = getWords(originalString); 

        int i = 0;
        double wordLengthSum = 0;

        for (String word : words) {
            wordLengthSum += word.length();
            i++;
        }
        return wordLengthSum / i;
    }

    /**
     * Method to find the average amount of words per sentence.
     * @return average amount of words per sentence.
     */
    public double getAverageWordPerSentence() { 
        String[] sentences = getSentences();

        int i = 0;
        double wordCountSum = 0;

        for (String sentence : sentences) {
            wordCountSum += wordCount(sentence);
            i++;
        }

        return wordCountSum / i;
    }

    /**
     * Method to replace a word with another in the string.
     * @param target the word to be replaced.
     * @param replacementString the word that will replace another word (target).
     */
    public void replaceWord(String target, String replacementString) { 
        originalString = originalString.replaceAll("(?i)(?<=\\s)" + Pattern.quote(target) + "(?=[\\s,.!?;:])", replacementString);
    }

    /**
     * Get-method for the string.
     * @return the string that belongs to the object.
     */
    public String getString() { 
        return originalString;
    }

    /**
     * Method to make the entire string uppercase letters.
     * @return the string in uppercase letters.
     */
    public String getUppercaseString() { 
        return originalString.toUpperCase();
    }

    /**
     * toString-method for the String object.
     */
    @Override
    public String toString() {
        return originalString;
    }
}