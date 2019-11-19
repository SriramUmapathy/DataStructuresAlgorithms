package com.ds.problem.math;

public class GridUniquePath {

    public static int uniquePaths(int A, int B) {

        int[][] matrix = new int[A][B];

        for (int i = 0; i < A; i++) {
            matrix[i][B - 1] = 1;
        }

        for (int i = 0; i < B; i++) {
            matrix[A - 1][i] = 1;
        }

        for (int i = matrix.length -2; i >= 0; i--) {
            for (int j = matrix[0].length -2; j >= 0; j--) {
                matrix[i][j] = matrix[i+1][j] + matrix[i][j+1];
            }
        }

        return matrix[0][0];
    }

    public static void printMat(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        GridUniquePath.uniquePaths(3,7);
    }
}
