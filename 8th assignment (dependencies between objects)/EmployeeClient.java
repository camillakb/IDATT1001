import java.util.Scanner;

import Classes.Employee;
import Classes.Person;

/**
 * Client for the Employee class.
 */

public class EmployeeClient {
    public static void main(String[] args) {
        //Initializing an example of a person and employee.
        Person examplePerson = new Person("FirstName", "LastName", 1980); 
        Employee exampleEmployee = new Employee(examplePerson, 48, 2018, 30000, 35);
        Person currentPerson, newPerson;
        int number;
        Scanner input = new Scanner(System.in); 

        do {
            System.out.println(exampleEmployee);
            System.out.println("Which field would you like to edit?");
            System.out.println("1. First name \n2. Last name \n3. Monthly salary \n4. Tax percentage"); 
            System.out.println("5. Figure out if employee has been hired for longer than a certain amount of years \n6. Quit");
            
            System.out.println("Enter your choice: ");
            int userChoice = Integer.parseInt(input.nextLine()); 
            System.out.println();

            
            number = userChoice;
            switch(number) {
                case 1:
                    System.out.println("Enter new first name: ");
                    String changeFN = input.nextLine();
                    currentPerson = exampleEmployee.getPersonalia();
                    newPerson = new Person(changeFN, currentPerson.getLastName(), currentPerson.getBirthYear());
                    exampleEmployee.setPersonalia(newPerson);
                    break; 

                case 2:
                    System.out.println("Enter new last name: ");
                    String changeLN = input.nextLine();
                    currentPerson = exampleEmployee.getPersonalia();
                    newPerson = new Person(currentPerson.getFirstName(), changeLN, currentPerson.getBirthYear());
                    exampleEmployee.setPersonalia(newPerson);
                    break; 

                case 3:
                    System.out.println("Enter new monthly salary: ");
                    double changeSalary = Double.parseDouble(input.nextLine());
                    exampleEmployee.setMonthlyPay(changeSalary);
                    break;

                case 4: 
                    System.out.println("Enter new tax percentage: ");
                    double changeTaxPercentage = Double.parseDouble(input.nextLine());
                    exampleEmployee.setTaxPercentage(changeTaxPercentage);
                    break;

                case 5:
                    System.out.println("Enter any amount of years: ");
                    int yearsAmount = Integer.parseInt(input.nextLine());
                    
                    if(exampleEmployee.hiredLongerThan(yearsAmount)) {
                        System.out.println("Yes, " + exampleEmployee.getNames() + " has been employed for longer than " + yearsAmount + " years.");

                    } else {
                        System.out.println("No, " + exampleEmployee.getNames() + " has not been hired for longer than " + yearsAmount + " years.");
                    }
                    break;
            } 

        } while(number != 6);
        
        input.close();
    }   
}