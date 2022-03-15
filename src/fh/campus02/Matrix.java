package fh.campus02;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        printMatrix(generateIdentityMatrix(5));
    }


    public static double[][] generateIdentityMatrix(int size) {
    double[][] double1= new double[size][size];
    for(int line=0; line<size; line++){
            for(int col=0; col<size; col++){
                if(col==line){
                    double1[line][col]=1.0;
                }else{
                    double1[line][col]=0.0;
            }
        }

    }
    return double1;

}
    public static void printMatrix(double[][] matrix){
        for(int matrixLine=0; matrixLine<matrix.length; matrixLine++){
            for(int matrixCol=0; matrixCol< matrix[matrixLine].length; matrixCol++){
                System.out.print(matrix[matrixLine][matrixCol] + "\t");
            }
            System.out.println();
        }
    }
}
