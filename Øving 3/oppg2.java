import java.util.Scanner;

public class oppg2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn et tall:");

        int tall = input.nextInt();
        input.close();
        Boolean primtall = true;

        for(int test = 2; test < tall; test++){
            if(tall % test == 0){
                primtall = false;
            }
        }
        if(primtall){
            System.out.printf("%d er et primtall!", tall);
        } else {
            System.out.printf("%d er ikke et primtall!", tall);
        }
    }
}
