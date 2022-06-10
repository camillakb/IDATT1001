import java.util.Scanner;

/**
 * Client that prints a part of the multiplication table that is decided by the users input.
 */

class MultiplicationTable{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number's multiplication table would you like to begin with?");
        int start = input.nextInt();
        System.out.println("Which number's multiplication table would you like to end with?");
        int end = input.nextInt();
        
        input.close();

        for(int table = start; table <= end; table++) {
            System.out.printf("Multiplication table for %d:\n", table);
            
            for(int multiplied = 1; multiplied <= 10; multiplied++){
                System.out.printf("%d * %d = %d\n", multiplied, table, multiplied * table);
            }
        }
    }
}