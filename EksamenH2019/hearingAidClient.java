import java.util.Scanner;

import Classes.HearingAid;
import Classes.HearingAidCentral;

public class hearingAidClient {

    public static void main(String [] args) {
        
        /**
         * Making an empty list of hearing aids and adding the examples given in the task.
         */
        HearingAidCentral listOfHearingAids = new HearingAidCentral();
        listOfHearingAids.addHearingAid(new HearingAid(1001, "Høreapparat", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(1002, "Høreapparat", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(1003, "Høreapparat", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(2001, "Samtaleforsterker", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(2002, "Samtaleforsterker", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(2003, "Samtaleforsterker", false, ""));
        listOfHearingAids.addHearingAid(new HearingAid(3001, "Varslingsutstyr", true, "Per Olsen"));
        listOfHearingAids.addHearingAid(new HearingAid(3003, "Varslingsutstyr", false, ""));

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
            System.out.println("Hva ønsker du å gjøre?");
            System.out.println("1. Registrer et nytt hjelpemiddel. \n2. Skriv ut liste over alle hjelpemidler med utleiestatus.");
            System.out.println("3. Leie ut et hjelpemiddel. \n4. Returnere et hjelpemiddel. \n5. Avslutt.");

            userInput = input.nextInt();
            System.out.println();

            switch(userInput) {

                case 1: 
                    System.out.println("Skriv ID-nummeret til det nye hjelpemiddelet.");
                    newID = input.nextInt();

                    System.out.println("Skriv inn hvilken type hjelpemiddel du vil registrere.");
                    input.nextLine();
                    newType = input.nextLine();

                    listOfHearingAids.addHearingAid(new HearingAid(newID, newType, false, ""));
                    
                    System.out.println("\nHjelpemiddelet er lagt til.");
                    break;

                case 2: 
                    System.out.println(listOfHearingAids); 
                    break;

                case 3:
                    System.out.println("Skriv ID-nummeret til hjelpemiddelet du ønsker å leie ut.");
                    newID = input.nextInt();

                    System.out.println("Skriv navnet til leietakeren.");
                    input.nextLine();
                    newName = input.nextLine();

                    listOfHearingAids.rentOutHearingAid(newID, newName); 
                    break;

                case 4:
                    System.out.println("Skriv ID-nummeret til hjelpemiddelet som skal returneres.");
                    newID = input.nextInt();

                    listOfHearingAids.returnHearingAid(newID); 
                    break;
            }

        } while (userInput != 5);

        input.close();
    } 
}
