package TextAnalysis;
import java.util.Arrays;

/**
 * Class with methods to analyze a string (using the Norwegian alphabet).
 */

public class TextAnalyzer {
    private int[] array;
    public char[] getMostUsed;

    /**
     * Simple constructor for the TextAnalyzer.
     * @param a array of integers to represent different letters.
     */
    public TextAnalyzer(int[] a) {
        this.array = a;
    }

    /**
     * Method to get the number of different letters used in a string.
     * @return an integer value that is the amount of different letters in a string.
     */
    public int  getNumberOfDifferentLetters() {
        int amountOfDifferentLetters = 0;
        for(int i = 0; i < this.array.length - 1; i++) {
            if(this.array[i] != 0) {
                amountOfDifferentLetters ++;
            }

        } return amountOfDifferentLetters;
    }

    /**
     * Method to get the total amount of letters used in a string.
     * @return an integer value that is the amount of letters used in a string.
     */
    public int getNumberOfLetters() {
        int numberOfLetters = 0;
        for(int i = 0; i < this.array.length - 1; i++) {
            if(this.array[i] != 0) {
                numberOfLetters += this.array[i];
            }

        } return numberOfLetters;
    }

    /**
     * Method to find the percentage of characters in the string that are not letters.
     * @return a percentage that represents the characters that are not letters in the string.
     */
    public double getPercentageOfNonLetterCharacters() {
        double numberOfNonLetterCharacters = 0;
        
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != 0) {
                numberOfNonLetterCharacters += this.array[i];
            }
        }

        double allCharacters = this.array[29];
        double percentage = ((allCharacters / numberOfNonLetterCharacters) * 100);
        return percentage;
    }

    /**
     * Method to get a letter from a string.
     * @param a the letter we want to get from the string.
     * @return the letters place in the alphabet represented by a number.
     */
    public int getLetter(char a) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int place = 0;

        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == a) {
                place = i;
            }

        } return this.array[place];
    }

    /**
     * Method to get the most often used letters.
     * @return a string containing the most used letters.
     */
    public String getMostUsedLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        int[] maxArr = new int[]{};
        char[] mostArr = new char []{};
        int place = 0;
        int greatest = 0;
        String mostOfString = "The letters most used is: ";

        //Checks what value that has the greatest number.
        for (int i = 0; i < this.array.length - 1; i++) { 
            if(this.array[i] > greatest) {
                greatest = this.array[i];
            }
        }

        //Checks if there are other values that are equal, and adding them to an array if that is the case.
        for (int i = 0; i < this.array.length - 1; i++) { 
            if(this.array[i] == greatest) {
                maxArr = Arrays.copyOf(maxArr, maxArr.length + 1);
                maxArr[place] = i;
                place++;
            }
        }

        //Making an array of the greatest values.
        for (int i = 0; i < maxArr.length; i++) { 
            mostArr = Arrays.copyOf(mostArr, mostArr.length +1);
            mostArr[i] = alphabet[maxArr[i]];
        }

        //Adding the values to the string.
        for (int i = 0; i < mostArr.length; i++) { 
            mostOfString += mostArr[i] + "";
        
        } return mostOfString;
    }
}

