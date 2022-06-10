package MatrixCalculations;

/**
 * Class for a matrix with relevant methods to perform calculations.
 */

public class Matrix {
    private int [][] matrix;
    private int r, k;

    /**
     * Simple constructor for a matrix.
     * @param matrix the dimensions for the matrix.
     */
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.r = matrix.length;
        this.k = this.matrix[0].length;

        int expectedRowLength = this.k;
        for (int[] row : matrix) {
            if (row.length != expectedRowLength) {
                throw new IllegalArgumentException("All rows in the matrix must be of the same length.");
            }
        }
    }

    /**
     * Get-method for the matrix.
     * @return the dimensions for a matrix.
     */
    public int[][] getMatrix() {
        return this.matrix;
    }

    /**
     * Method to add a matrix to another.
     * @param B the matrix that will be added to another.
     * @return the resulting matrix of the addition.
     */
    public Matrix add(Matrix B) {
        if (this.r != B.r || this.k != B.k) {
            return null;
        }

        int [][] matrixSum = new int[this.r][this.k]; 

        for (int i = 0; i < this.r; i++) {
            for(int j = 0; j < this.k; j++) {
                matrixSum[i][j] = matrix[i][j] + B.matrix[i][j];
            }
        }

        return new Matrix(matrixSum);   
    }

    /**
     * Method to multiply a matrix to another.
     * @param B the matrix that will be multiplied with another.
     * @return the resulting matrix of the multiplication.
     */
    public Matrix multiply(Matrix B) {
        if(this.k != B.r) {
            return null;
        }

        int[][] buf = new int[this.r][B.k];

        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < B.k; j++) {
                for (int k = 0; k < this.k; k++) {
                    buf[i][j] += this.matrix[i][k] * B.matrix[k][j];
                }
            }
        }

        return new Matrix(buf);
    }

    /**
     * Method to transpose a matrix.
     * @return the transposed matrix.
     */
    public Matrix transpose() {
        int[][] transposedMatrix = new int[this.k][this.r]; 

        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.k; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return new Matrix(transposedMatrix);
    }

    /**
     * toString-method for the matrix.
     */
    public String toString() {
        String buffer = "";

        for (int[] row : this.matrix) {
            buffer = buffer.concat("| ");
            for (int value : row) {
                buffer = buffer.concat(String.format("%d ", value));
            }
            buffer = buffer.concat("|\n");
        }

        return buffer;
    }
}
