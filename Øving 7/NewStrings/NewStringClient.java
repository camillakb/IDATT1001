package NewStrings;

/**
 * Client for the NewString class.
 */

public class NewStringClient {
    public static void main(String [] args) {
        String testString = "I am writing a test string.";

        NewString test = new NewString(testString);

        System.out.println(test.getAcronym());
        System.out.println(test.removeChar("t"));
    }
}