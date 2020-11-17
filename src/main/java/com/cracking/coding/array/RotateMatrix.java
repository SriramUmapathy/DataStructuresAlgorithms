package com.cracking.coding.array;

public class RotateMatrix {

    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for(int i = 0; i <= (mat.length-1)/2; i++) {
            for(int j = i; j < mat.length -1- i; j++) {
                int p1 = mat[i][j];
                mat[i][j] = mat[mat.length - 1 - j][i];
                mat[mat.length - 1 - j][i] = mat[mat.length - 1 - i][mat.length - j - 1];
                mat[mat.length - 1 - i][mat.length - j - 1] = mat[j][mat.length - 1 - i];
                mat[j][mat.length - 1 - i] = p1;
            }
        }

        for(int i = 0; i <= mat.length-1; i++) {
            for(int j = 0; j <= mat.length -1; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
