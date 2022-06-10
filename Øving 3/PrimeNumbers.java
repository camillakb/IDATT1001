import java.util.Scanner;

/**
 * CLient that lets a user check if a number is a prime number or not.
 */

public class PrimeNumbers {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that is 1 or greater, or enter '0' to quit:");
        int inputNumber = input.nextInt();
        
        while (inputNumber != 0){
            boolean primeNumber = true;

            for (int test = 2; test < inputNumber; test++) {
                if(inputNumber % test == 0){
                    primeNumber = false;
                }
            }
            
            if (primeNumber) {
                System.out.printf("%d is a prime number!\n\n", inputNumber);
            
            } else {
                System.out.printf("%d is not a prime number.\n\n", inputNumber);
            }

            System.out.println("Enter a number that is 1 or greater, or enter '0' to quit:");
            inputNumber = input.nextInt();
        }

        input.close();
        System.out.println("Bye!");
    }
}
