package CurrencyCalculator;
import java.util.Scanner; 

/**
 * Client that allows the user to convert from dollars, euros or SEK to NOK.
 */

class CurrencyCalculatorClient {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Registering currencies and conversion rates in a list of Currency objects.
        Currency dollar = new Currency("Dollars", 8.71);
        Currency euro = new Currency("Euro", 10.21);
        Currency sek = new Currency("SEK", 1.0028);
        Currency[] currencies = {dollar, euro, sek};

        while(true) {
            System.out.println("Which currency would you like to convert to NOK?");        
            
            //Printing the available options of currencies to choose from.
            for (int i = 0; i < currencies.length; i++) {
                System.out.printf("%d: %s\n", i+1, currencies[i].getName());
            }

            System.out.println("4: Quit");
            int valg = input.nextInt();

            //If the user chooses option 4, the program will stop running.
            if (valg == 4) {
                System.out.println("Bye!");
                input.close();
                return;
            }
            
            System.out.println("Which amout would you like to convert?");
            double amountOfCurrency = input.nextDouble();

            //Prints the result of the convertion.
            double amountOfNOK = currencies[valg - 1].toNOK(amountOfCurrency);
            System.out.printf("%.2f %s is %.2f NOK\n", amountOfCurrency, currencies[valg - 1].getName(), amountOfNOK);
        }
    }
}