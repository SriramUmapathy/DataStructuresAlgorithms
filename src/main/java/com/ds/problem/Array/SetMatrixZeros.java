package com.ds.problem.Array;

import java.util.ArrayList;

public class SetMatrixZeros {


    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        //set first row and column zero or not
        for(int i=0; i<a.size(); i++){
            if(a.get(i).get(0) == 0){
                firstColumnZero = true;
                break;
            }
        }

        for(int i=0; i<a.get(0).size(); i++){
            if(a.get(0).get(i) == 0){
                firstRowZero = true;
                break;
            }
        }

        //mark zeros on first row and column
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(j) == 0){
//                    matrix[i][0] = 0;
//                    matrix[0][j] = 0;
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }

        //use mark to set elements
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0){
//                    matrix[i][j] = 0;
                    a.get(i).set(j,0);
                }
            }
        }

        //set first column and row
        if(firstColumnZero){
            for(int i=0; i<a.size(); i++)
//                matrix[i][0] = 0;
                a.get(i).set(0,0);
        }

        if(firstRowZero){
            for(int i=0; i<a.get(0).size(); i++)
//                matrix[0][i] = 0;
                a.get(0).set(i,0);
        }

//        System.out.println(a);
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        ArrayList<Integer> inner = new ArrayList<>();
        inner.add(1);
        inner.add(0);
        inner.add(1);
        outer.add(inner);

        inner = new ArrayList<>();
        inner.add(1);
        inner.add(1);
        inner.add(1);
        outer.add(inner);

        inner = new ArrayList<>();
        inner.add(1);
        inner.add(1);
        inner.add(1);
        outer.add(inner);



        new SetMatrixZeros().setZeroes(outer);
    }
}
