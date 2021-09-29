import Klasser.MinRandom;

public class oppg2 {
    public static void main(String [] args) {
        MinRandom generator = new MinRandom();

        System.out.println("Desimaltall mellom 1.5 og 3.5: ");

        for(int i = 0; i < 15; i++) {
            System.out.println(generator.nesteDesimaltall(1.5, 3.5));
        }

        int nedre = 0;
        int ovre = 10;
        int antall = 80;

        int[] generated = new int[ovre - nedre + 1];

        System.out.printf("\nHeltall mellom %d og %d\n", nedre, ovre);

        for(int i = 0; i < antall; i++) {
            generated[generator.nesteHeltall(nedre, ovre) - nedre]++;
        }

        for(int j = 0; j < generated.length; j++) {
            System.out.printf("%d: %d\n", nedre + j, generated[j]);
        }

    }
}
