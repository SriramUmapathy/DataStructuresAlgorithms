package com.ds.problem.Array;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {


    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int max = 0;
        for(int i = 1; i < A.size(); i++)
            max += Math.max(Math.abs(A.get(i - 1) - A.get(i)), Math.abs( B.get(i - 1) -  B.get(i)));
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(4);
        B.add(4);

        A.add(8);
        B.add(-15);

//        A.add(-7);
//        B.add(-10);
//
//        A.add(-5);
//        B.add(-3);
//
//        A.add(-13);
//        B.add(-13);
//
//        A.add(9);
//        B.add(12);
//
//        A.add(-7);
//        B.add(8);
//
//        A.add(8);
//        B.add(-8);

        System.out.print(coverPoints(A,B));
    }
}
