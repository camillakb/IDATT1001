import Classes.LongJumpRegister;
import Classes.LongJumpResult;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Client program to view and manage long jump results.
 */

public class longJumpClient {

    public static void main(String [] args) {

        /**
         * Making an empty LongJumpRegister list and adding examples.
         */
        LongJumpRegister longJumpRegistry = new LongJumpRegister();
        longJumpRegistry.addLongJump(new LongJumpResult(210, "Malaika Mihambo", 6.98, false, LocalTime.of(10,15)));
        longJumpRegistry.addLongJump(new LongJumpResult(211, "Tara Davis", 6.85, false, LocalTime.of(10,17)));
        longJumpRegistry.addLongJump(new LongJumpResult(204, "Brittney Reese", 6.52, false, LocalTime.of(10,19)));
        longJumpRegistry.addLongJump(new LongJumpResult(224, "Khaddi Sagnia", 6.76, false, LocalTime.of(10,21)));
        longJumpRegistry.addLongJump(new LongJumpResult(211, "Tara Davis", 6.42, true, LocalTime.of(10,24)));
        longJumpRegistry.addLongJump(new LongJumpResult(210, "Malaika Mihambo", 6.56, false, LocalTime.of(10,30)));
        longJumpRegistry.addLongJump(new LongJumpResult(204, "Brittney Reese", 6.86, false, LocalTime.of(10,34)));
        longJumpRegistry.addLongJump(new LongJumpResult(224, "Khaddi Sagnia", 6.65, true, LocalTime.of(10,37)));
        longJumpRegistry.addLongJump(new LongJumpResult(210, "Malaika Mihambo", 6.12, false, LocalTime.of(10,40)));
        
        /**
         * Attributes used in the client program.
         */
        Scanner input = new Scanner(System.in);
        int userInput, inputStartNumber, inputHour, inputMinute;
        String inputName;
        boolean inputFaul;
        double inputResult;


        /**
         * Do-while loop that can (1) add a new long jump result to the list, (2) print all registered results, (3) search for all
         * results by a given athletes name, (4) View the best result and (5) find the average result of all registered jumps.
         */
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a new long jump result. \n2. Print all registered results.");
            System.out.println("3. Search for all results by an athlete. \n4. View the best result.");
            System.out.println("5. Find the average result of all the registered long jumps. \n6. Quit.");

            userInput = input.nextInt();
            System.out.println();

            switch(userInput) {
                
                /**
                 * Registering a new result by getting start number, name, length of the jump, validity of the jump and time of the jump.
                 * The input.nextLine(); is to consume the extra \n character before registering the next string input.
                 * When asking if the jump is faulty, everything except Y will register the jump as valid.
                 */
                case 1: 
                    System.out.println("Write the start number of the athlete you'd like to register: "); 
                    inputStartNumber = input.nextInt();

                    System.out.println("Write the athletes name: ");
                    input.nextLine();
                    inputName = input.nextLine();

                    System.out.println("Write the length of the jump in metres: ");
                    inputResult = input.nextDouble();

                    System.out.println("Was this jump a faul? Y for yes, N for no.");
                    input.nextLine();
                    inputFaul = input.nextLine().equalsIgnoreCase("N");

                    System.out.println("Enter the time of the jump: \nHour:");
                    inputHour = input.nextInt();
                    System.out.println("Minute:");
                    inputMinute = input.nextInt();

                    longJumpRegistry.addLongJump(new LongJumpResult(inputStartNumber, inputName, inputResult, inputFaul, LocalTime.of(inputHour, inputMinute)));
                    break;

                /**
                 * Prints the entire registry.
                 */
                case 2:
                    System.out.println(longJumpRegistry);
                    break;

                /**
                 * Prints all results for a given athlete.
                 * input.nextLine(); is to consume the extra \n character before registering the next String input.
                 */
                case 3:
                    System.out.println("What athlete would you like to see the results for?");
                    input.nextLine();
                    inputName = input.nextLine();

                    System.out.println(longJumpRegistry.getResultsFromAthlete(inputName));
                    break;

                /**
                 * Prints the best result in total, and best valid result.
                 */
                case 4: 
                    System.out.println("Best result in total: " + longJumpRegistry.getBestResult());
                    System.out.println("\nBest valid result: " + longJumpRegistry.getBestValidResult());
                    break;

                /**
                 * Prints the average result in metres.
                 */    
                case 5:
                    System.out.println("Average result in metres: " + longJumpRegistry.getAverageResult());
                    break;
            }

        } while (userInput != 6);

        input.close();
    }
}
