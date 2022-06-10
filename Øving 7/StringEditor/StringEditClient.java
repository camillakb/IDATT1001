package StringEditor;

/**
 * Client for the StringEdit class.
 */

public class StringEditClient {

    public static void main(String[] args) {
        
        String testString = "Hello! In this text I has a grammatical error. Such mistakes can happen when you don't pay proper attention.";

        String searchString = "has";
        String replacementString = "have";

        StringEdit test = new StringEdit(testString);

        System.out.println("Number of words in the string: " + test.wordCount() + "\n");
        System.out.println("Average word length: " + test.getAverageLength() + "\n");
        System.out.println("Average amount of words per sentence: " + test.getAverageWordPerSentence() + "\n");
        System.out.println("String with replaced words: "); 
        test.replaceWord(searchString, replacementString);
        System.out.println("\n" + test + "\n");
        System.out.println("Original string: " + testString + "\n");
        System.out.println("String in uppercase letters: " + test.getUppercaseString());
    }
}
