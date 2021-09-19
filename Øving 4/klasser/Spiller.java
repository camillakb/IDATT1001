package klasser;
import java.util.Random;


public class Spiller {
    private int poengsum;
    private Random terning;
    
    public Spiller() {
        this.poengsum = 0;
        this.terning = new Random();
    }

    public int getPoengsum() {
        return this.poengsum;
    }
    
    public void kastTerning() {
        int terningkast = this.terning.nextInt(6) + 1;
        if(terningkast == 1) {
            this.poengsum = 0;
        } else if(this.poengsum > 100) {
            this.poengsum -= terningkast;
        }else{
            this.poengsum += terningkast;
        }
    }
    
    public boolean erFerdig() {
        return this.poengsum == 100;
    }
}
