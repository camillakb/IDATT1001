import java.util.Scanner;

import Classes.Property;
import Classes.PropertyRegister;

public class propertyclient {
    
    public static void main(String[] args) {

        /**
         * Making an empty PropertyRegister list and adding examples given in the task.
         */
        PropertyRegister propertyList = new PropertyRegister();
        propertyList.addProperty(new Property(1445, "Gloppen", 77, 631, "", 1071.6, "Jens Olsen"));
        propertyList.addProperty(new Property(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        propertyList.addProperty(new Property(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        propertyList.addProperty(new Property(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        propertyList.addProperty(new Property(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

        /**
         * Attributes used in the client program.
         */
        Scanner input = new Scanner(System.in); 
        int userInputNumber, newMunicipalityNumber, newLotNumber, newSectionNumber;
        String newMunicipalityName, newName, newNameOfOwner;
        double newArea;


        /**
         * Do-while loop for the applications so it is possible to choose multiple actions or choose to quit.
         */
        do {
            /**
             * Menu for the application.
             */
            System.out.println("What would you like to do?");
            System.out.println("1. Add a new property to the property register.");
            System.out.println("2. See all properties in the property register.");
            System.out.println("3. Search for a property in the register by the property's municipality number, lot number and section number.");
            System.out.println("4. Calculate the average area of all the properties in the property register.");
            System.out.println("5. Quit.");

            userInputNumber = input.nextInt();
            System.out.println("");

            switch(userInputNumber) {

                /**
                 * Case 1 let's the user register a new property. The input.nextLine() methods are used to consume the extra \n
                 * characters that appear before registering the next String input.
                 */
                case 1:
                    System.out.println("What is the municipality number where the property is located?");
                    newMunicipalityNumber = input.nextInt();

                    System.out.println("What is the municipality name where the property is located?");
                    input.nextLine(); 
                    newMunicipalityName = input.nextLine();

                    System.out.println("What is the lot number for this property?");
                    newLotNumber = input.nextInt();

                    System.out.println("What is the section number for this property?");
                    newSectionNumber = input.nextInt();

                    System.out.println("What is the name of the property? If there is no name, please leave a blank space.");
                    input.nextLine();
                    newName = input.nextLine();

                    System.out.println("What is the area of the property?");
                    newArea = input.nextDouble();

                    System.out.println("What is the name of the property's owner?");
                    input.nextLine();
                    newNameOfOwner = input.nextLine();

                    propertyList.addProperty(new Property(newMunicipalityNumber, newMunicipalityName, newLotNumber, newSectionNumber, newName, newArea, newNameOfOwner));
                    System.out.println("Property is added to the register.");
                    break;

                /**
                 * Case 2 prints all the properties in the register.
                 */
                case 2:
                    System.out.println(propertyList); 
                    break;

                /**
                 * Case 3 searches for properties by municipality number, lot number and section number.
                 */
                case 3:
                    System.out.println("Please enter the municipality number of the property.");
                    newMunicipalityNumber = input.nextInt();
                    System.out.println("Please enter the lot number of the property.");
                    newLotNumber = input.nextInt();
                    System.out.println("Please enter the section number of the property.");
                    newSectionNumber = input.nextInt();
                    System.out.println(propertyList.findProperty(newMunicipalityNumber, newLotNumber, newSectionNumber)); 
                    break;

                /**
                 * Case 4 calculates and prints the average area for the properties in the register.
                 */
                case 4:
                    System.out.println(propertyList.getAverageArea());
                    break;

                default:
                    break;

            }

        } while (userInputNumber != 5);

        input.close();
    }
}
