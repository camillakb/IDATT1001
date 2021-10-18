import Klasser.ArbTaker;
import Klasser.Person;
import java.util.Scanner;


public class ArbTakerKlient {
    public static void main(String[] args) {
        Person imThePerson = new Person("Camilla", "Birkelund", 1995); 
        ArbTaker imAtWork = new ArbTaker(imThePerson, 48, 2018, 30000, 35);
        Person currentPerson, newPerson;
        int number;
        Scanner input = new Scanner(System.in); //Scanner object

        do {
            System.out.println(imAtWork);
            System.out.println("Which field would you like to edit?");
            System.out.println("1. First name \n2. Last name \n3. Monthly salary \n4. Tax percentage"); 
            System.out.println("5. Figure out if employee has been hired for longer than a certain amount of years \n6. Quit");
            
            System.out.println("Enter your choice: ");
            int userChoice = Integer.parseInt(input.nextLine()); //Read user input
            System.out.println();

            
            number = userChoice;
            switch(number) {
                case 1:
                    System.out.println("Enter new first name: ");
                    String changeFN = input.nextLine();
                    currentPerson = imAtWork.getPersonalia();
                    newPerson = new Person(changeFN, currentPerson.getLastName(), currentPerson.getBirthYear());
                    imAtWork.setPersonalia(newPerson);
                    break; 

                case 2:
                    System.out.println("Enter new last name: ");
                    String changeLN = input.nextLine();
                    currentPerson = imAtWork.getPersonalia();
                    newPerson = new Person(currentPerson.getFirstName(), changeLN, currentPerson.getBirthYear());
                    imAtWork.setPersonalia(newPerson);
                    break; 

                case 3:
                    System.out.println("Enter new monthly salary: ");
                    double changeSalary = Double.parseDouble(input.nextLine());
                    imAtWork.setMonthlyPay(changeSalary);
                    break;

                case 4: 
                    System.out.println("Enter new tax percentage: ");
                    double changeTaxPercentage = Double.parseDouble(input.nextLine());
                    imAtWork.setTaxPercentage(changeTaxPercentage);
                    break;

                case 5:
                    System.out.println("Enter any amount of years: ");
                    int yearsAmount = Integer.parseInt(input.nextLine());
                    
                    if(imAtWork.hiredLongerThan(yearsAmount)) {
                        System.out.println("Yes, " + imAtWork.getNames() + " has been employed for longer than " + yearsAmount + " years.");

                    } else {
                        System.out.println("No, " + imAtWork.getNames() + " has not been hired for longer than " + yearsAmount + " years.");
                    }
                    break;

            } 

        } while(number != 6);
        
        input.close();
    }   
}