package Klasser;

import java.util.Random;
public class MinRandom {
    
    private Random memberGenerator;

    public MinRandom() {
        this.memberGenerator = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {
        return memberGenerator.nextInt(ovre - nedre + 1) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return memberGenerator.nextDouble() * (ovre - nedre) + nedre;
    }
}
