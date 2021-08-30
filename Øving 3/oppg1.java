import java.util.Scanner;

class oppg1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken gangetabell vil du starte med?");
        int start = input.nextInt();
        System.out.println("Hvilken gangetabell vil du slutte med?");
        int slutt = input.nextInt();
        input.close();

        for(int tabell = start; tabell <= slutt; tabell++) {
            System.out.printf("%d-gangen:\n", tabell);
            for(int multiplisert = 1; multiplisert <= 10; multiplisert++){
                System.out.printf("%d * %d = %d\n", multiplisert, tabell, multiplisert * tabell);
            }
        }

    }
}