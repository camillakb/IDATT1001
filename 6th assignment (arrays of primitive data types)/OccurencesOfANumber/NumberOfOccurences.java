package OccurencesOfANumber;
import java.util.Random; 

/**
 * Client to check the number of occurences of an integer between 0-9 in a given interval.
 */

public class NumberOfOccurences {
    public static void main(String [] args) {
        Random random = new Random();
        int[] randomList = new int[10];
        int amountOfNumbers = 1000;

        //Generating a list of the given amount of numbers in the interval 0-9.
        for (int i = 0; i < amountOfNumbers; i++) {
            randomList[random.nextInt(10)] +=1;
        }

        System.out.printf("Random distribution of %d numbers in the interval (0, 9):\n", amountOfNumbers);
        System.out.println("0: " + randomList[0] + " occurrences.\n"
        + "1: " + randomList[1] + " occurrences.\n"
        + "2: " + randomList[2] + " occurrences.\n"
        + "3: " + randomList[3] + " occurrences.\n"
        + "4: " + randomList[4] + " occurrences.\n"
        + "5: " + randomList[5] + " occurrences.\n"
        + "6: " + randomList[6] + " occurrences.\n"
        + "7: " + randomList[7] + " occurrences.\n"
        + "8: " + randomList[8] + " occurrences.\n"
        + "9: " + randomList[9] + " occurrences.\n");
    }
} 