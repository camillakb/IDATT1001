import java.util.Scanner;

import Classes.HearingAid;
import Classes.HearingAidCentral;

/**
 * Client to view and edit information about hearing aids.
 */

public class hearingAidClient {

    public static void main(String [] args) {
        
        /**
         * Making an empty list of hearing aids and adding the examples given in the task.
         */
        HearingAidCentral listOfHearingAids = new HearingAidCentral();
        listOfHearingAids.addHearingAid(new HearingAid(1001, "Hearing aid", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(1002, "Hearing aid", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(1003, "Hearing aid", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(2001, "Conversation amplifier", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(2002, "Conversation amplifier", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(2003, "Conversation amplifier", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(3001, "Warning equipment", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(3003, "Warning equipment", false, ""));

        /**
         * Attributes used in the client program.
         */
        Scanner input = new Scanner(System.in);
        int userInput, newID;
        String newType, newName;

        /**
         * Do-while loop that can (1) add a new hearing aid to the register, (2) print a list of all hearing aids with their current
         * rental status, (3) rent out a hearing aid and (4) return a hearing aid.
         * The instances of input.nextLine() is to consume the extra \n characters that appear before registering the new string input.
         */

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Register a new hearing aid. \n2. Print a list of all hearing aids with their current rental status.");
            System.out.println("3. Rent out a hearing aid. \n4. Return a hearing aid. \n5. Quit.");

            userInput = input.nextInt();
            System.out.println();

            switch(userInput) {

                case 1: 
                    System.out.println("What is the ID of the new hearing aid?");
                    newID = input.nextInt();

                    System.out.println("What type of hearing aid would you like to register?");
                    input.nextLine();
                    newType = input.nextLine();

                    listOfHearingAids.addHearingAid(new HearingAid(newID, newType, false, ""));
                    
                    System.out.println("\nThe hearing aid has been added to the register.");
                    break;

                case 2: 
                    System.out.println(listOfHearingAids); 
                    break;

                case 3:
                    System.out.println("Enter the ID of the hearing aid you would like to rent out.");
                    newID = input.nextInt();

                    System.out.println("Enter the name of the renter.");
                    input.nextLine();
                    newName = input.nextLine();

                    listOfHearingAids.rentOutHearingAid(newID, newName); 
                    break;

                case 4:
                    System.out.println("Enter the ID of the hearing aid you would like to return.");
                    newID = input.nextInt();

                    listOfHearingAids.returnHearingAid(newID); 
                    break;
            }

        } while (userInput != 5);

        input.close();
    } 
}
