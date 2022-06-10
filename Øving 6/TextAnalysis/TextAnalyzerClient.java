package TextAnalysis;
import java.util.Scanner;

/**
 * Client for the TextAnalyzer class.
 */

public class TextAnalyzerClient {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        String text;

        do {
            System.out.println("Enter a text using the Norwegian alphabet, or simply press enter to quit:");
            text = sc.nextLine().toLowerCase();
            
            //Takes the string given by the user and turns it into an array of characters.
            char[] textArr = text.toCharArray();
            char[] alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
            int[] numberOfCharacters = new int[30];

            for (int i = 0; i < textArr.length; i++) {
                for (int k = 0; k < alphabet.length; k++) {
                    if (textArr[i] == alphabet[k]) {
                        numberOfCharacters[k]++;
                    }
                }

                if (Character.isLetter(textArr[i]) == false) {
                    numberOfCharacters[29]++;
                }
            }

            TextAnalyzer t1 = new TextAnalyzer(numberOfCharacters);
            System.out.println("The total amount of different letters is: " + t1.getNumberOfDifferentLetters());
            System.out.println("The total number of letters is: " + t1.getNumberOfLetters());
            System.out.println("The percentage of characters used that are not letters is : " + t1.getPercentageOfNonLetterCharacters() + "%");
            System.out.println("The number of times the letter 'c' is used is: " + t1.getLetter('c'));
            System.out.println(t1.getMostUsedLetter());
        
        } while (text != "");
        sc.close();
    }
}
   