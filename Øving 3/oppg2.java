import java.util.Scanner;

public class oppg2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn et tall eller 0 for å avslutte:");

        int tall = input.nextInt();
        while(tall != 0){
            boolean primtall = true;

            for(int test = 2; test < tall; test++){
                if(tall % test == 0){
                    primtall = false;
                }
            }
            if(primtall){
                System.out.printf("%d er et primtall!\n\n", tall);
            } else {
                System.out.printf("%d er ikke et primtall!\n\n", tall);
            }

            System.out.println("Skriv inn et tall eller 0 for å avslutte:");

            tall = input.nextInt();
        }
        input.close();
       System.out.println("Oki snakkes");
    }
}
