package MatrixCalculations;

/**
 * Client for the Matrix class.
 */

public class MatrixClient {
    public static void main(String[] args) {

        //Creating two Matrix objects.
        int[][] valuesMatrixOne = {{1, 2, 3}, {4, 5, 6}}; //2x3 matrix
        int[][] valuesMatrixTwo = {{2, 3, 4}, {6, 4, 7}, {9, 5, 2}}; //3x3 matrix

        Matrix matrixOne = new Matrix(valuesMatrixOne);
        Matrix matrixTwo = new Matrix(valuesMatrixTwo);

        System.out.println(matrixOne + " + \n" + matrixOne + " =\n" + matrixOne.add(matrixOne));
        System.out.println(matrixOne + " * \n" + matrixTwo + " =\n" + matrixOne.multiply(matrixTwo));
        System.out.println(matrixOne + "transposed is\n" + matrixOne.transpose());
    }
}    
