import Klasser.Matrise;

public class oppg3 {
    public static void main(String[] args) {
        int[][] verdier1 = {{1, 2, 3}, {4, 5, 6}}; // 2x3
        int[][] verdier2 = {{2, 3, 4}, {6, 4, 7}, {9, 5, 2}}; // 3x3

        Matrise matrise1 = new Matrise(verdier1);
        Matrise matrise2 = new Matrise(verdier2);

        System.out.println("Matrise 1 pluss matrise 1 er\n" + matrise1.add(matrise1));
        System.out.println("Matrise 1 multiplisert med matrise 2 er\n" + matrise1.multipliser(matrise2));
        System.out.println("Matrise 1 transponert er\n" + matrise1.transponer());
        
    }
}    
