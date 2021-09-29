package Klasser;

public class Matrise {
    private int [][] matrise;
    private int r, k;

    public Matrise(int[][] matrise) {
        this.matrise = matrise;
        this.r = matrise.length;
        this.k = this.matrise[0].length;

        int forventetRadlengde = this.k;
        for (int[] rad : matrise) {
            if (rad.length != forventetRadlengde) {
                throw new IllegalArgumentException("Alle rader i matrisen må ha samme lengde.");
            }
        }
    }

    public int[][] getMatrise() {
        return this.matrise;
    }

    public Matrise add(Matrise B) {
        if(this.r != B.r || this.k != B.k) {
            return null;
        }

        int [][] matriseSum = new int[this.r][this.k]; 

        for(int i = 0; i < this.r; i++) {
            for(int j = 0; j < this.k; j++) {
                matriseSum[i][j] = matrise[i][j] + B.matrise[i][j];
            }
        }

        return new Matrise(matriseSum);   
    }

    public Matrise multipliser(Matrise B) {
        if(this.k != B.r) {
            return null;
        }

        int[][] buf = new int[this.r][B.k];

        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < B.k; j++) {
                for (int k = 0; k < this.k; k++) {
                    buf[i][j] += this.matrise[i][k] * B.matrise[k][j];
                }
            }
        }

        return new Matrise(buf);
    }

    public Matrise transponer() {
        int[][] transponertMatrise = new int[this.k][this.r]; // bytte rad og kolonnelendger

        for(int i = 0; i < this.r; i++) {
            for(int j = 0; j < this.k; j++) {
                transponertMatrise[j][i] = matrise[i][j];
            }
        }

        return new Matrise(transponertMatrise);
    }

    public String toString() {
        String buffer = "";

        for (int[] rad : this.matrise) {
            buffer = buffer.concat("| ");
            for (int verdi : rad) {
                buffer = buffer.concat(String.format("%d ", verdi));
            }
            buffer = buffer.concat("|\n");
        }

        return buffer;
    }
}
