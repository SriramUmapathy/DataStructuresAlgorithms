package com.ds.problem.math;

public class GridUniquePath {

    public static int uniquePaths(int A, int B) {
        return  ncr(A+B-2, Math.min (A-1, B-1));
    }

    private static int ncr(int n, int r) {
        System.out.println(n+" "+r);
        long res = 1;

        int R = Math.min (r, n-r);
        for ( int i=1; i<=R; i++){
            res*=n;
            n--;
        }
        System.out.println(res);
        long res1 = 1;
        for ( int i=1; i<=r; i++){
            res1*=i;
        }


        System.out.println(res1);
        return (int) (res/res1);
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
        System.out.println(GridUniquePath.uniquePaths(3,7));
    }
}
