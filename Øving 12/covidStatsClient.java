import Classes.CovidStats;
import Classes.CovidStatsRegister;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * Client for the CovidStatsRegister class.
 */

public class CovidStatsClient {

    public static void main (String [] args) {
        
        //Initializing a CovidStatsRegister list and adding examples.
        CovidStatsRegister covidRegistry = new CovidStatsRegister();
        covidRegistry.addCovidRegistry(new CovidStats("China", LocalDate.of(2020, 01, 19), 136, 1));
        covidRegistry.addCovidRegistry(new CovidStats("China", LocalDate.of(2020, 02, 05), 3872, 66));
        covidRegistry.addCovidRegistry(new CovidStats("Norway", LocalDate.of(2020, 03, 07), 3, 0));
        covidRegistry.addCovidRegistry(new CovidStats("USA", LocalDate.of(2020, 03, 9), 259, 4));
        covidRegistry.addCovidRegistry(new CovidStats("China", LocalDate.of(2020, 03, 9), 45, 23));
        covidRegistry.addCovidRegistry(new CovidStats("Norway", LocalDate.of(2020, 03, 22), 240, 8));
        covidRegistry.addCovidRegistry(new CovidStats("USA", LocalDate.of(2020, 03, 24), 20341, 119));
        covidRegistry.addCovidRegistry(new CovidStats("China", LocalDate.of(2020, 03, 25), 28, 4));
        covidRegistry.addCovidRegistry(new CovidStats("Norway", LocalDate.of(2020, 04, 06), 110, 3));
        covidRegistry.addCovidRegistry(new CovidStats("USA", LocalDate.of(2020, 04, 10), 30859, 2087));
        covidRegistry.addCovidRegistry(new CovidStats("China", LocalDate.of(2020, 04, 10), 55, 1));
    
        Scanner input = new Scanner(System.in);
        int inputNumber, newYear, newMonth, newDay, newInfected, newDeaths;
        String newCountry;
        LocalDate newDate;

        //Do-while loop to allow the user to make multiple choices when running the client.
        //The instances of 'input.nextLine()' is to consume the extra \n character.
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a new entry to the registry. \n2. Print all registries. \n3. Search for a registry by date.");
            System.out.println("4. Search for registries after a given date. \n5. Calculate number of deaths for a given country.");
            System.out.println("6. Calculate number of infected for a given country. \n7. Quit.");

            inputNumber = input.nextInt();
            System.out.println("");

            switch(inputNumber) {

                case 1: //Add new entry to the registry.
                    System.out.println("Which country would you like to register?");
                    input.nextLine();
                    newCountry = input.nextLine();

                    System.out.println("Enter the year:");
                    newYear = input.nextInt();
                    System.out.println("Enter the month:");
                    newMonth = input.nextInt();
                    System.out.println("Enter the day:");
                    newDay = input.nextInt();

                    System.out.println("Enter number of people infected by covid:");
                    newInfected = input.nextInt();

                    System.out.println("Enter the number of deaths by covid:");
                    newDeaths = input.nextInt();

                    covidRegistry.addCovidRegistry(new CovidStats(newCountry, LocalDate.of(newYear, newMonth, newDay), newInfected, newDeaths));
                    System.out.println("Entry successfully added to the register.");

                    break;

                case 2: //Print all registries.
                    System.out.println(covidRegistry);
                    break;

                case 3: //Find registry by date.
                    System.out.println("What date would you like to search for? \nEnter year:"); 
                    newYear = input.nextInt();

                    System.out.println("Enter month:");
                    newMonth = input.nextInt();

                    System.out.println("Enter day:");
                    newDay = input.nextInt();

                    newDate = LocalDate.of(newYear, newMonth, newDay);
                    System.out.println(covidRegistry.getCovidStatsAtDate(newDate));

                    break;

                case 4: //Find registries after a given date.
                    System.out.println("What date would you like to search for? \nEnter year:");
                    newYear = input.nextInt();

                    System.out.println("Enter month:");
                    newMonth = input.nextInt();

                    System.out.println("Enter day:");
                    newDay = input.nextInt();

                    newDate = LocalDate.of(newYear, newMonth, newDay);
                    System.out.println(covidRegistry.getCovidStatsAfterDate(newDate));

                    break;

                case 5: //See numbers of deaths for a given country.
                    System.out.println("What country would you like to see number of deaths for?");
                    input.nextLine();
                    newCountry = input.nextLine();

                    System.out.println(covidRegistry.numberOfDeathsInCountry(newCountry));

                    break;

                case 6: //See number of infected for a given country.
                    System.out.println("What country would you like to see number of infected for?");
                    input.nextLine();
                    newCountry = input.nextLine();
                    
                    System.out.println(covidRegistry.numberOfInfectedInCountry(newCountry));
                    
                    break;
            }

        } while(inputNumber != 7);
        input.close();
    }
}

