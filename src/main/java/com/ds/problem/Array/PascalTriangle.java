package com.ds.problem.Array;

import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        for(int i = 0; i < A; i++ ) {
            ArrayList<Integer> inner = new ArrayList<>();

            if(i == 0){
                inner.add(1);
                outer.add(inner);
                continue;
            }

            for(int j = 0; j <= i; j++ ) {

                ArrayList<Integer> exist = outer.get(i-1);

                if(j == 0){
                    inner.add(1);
                    continue;
                }

                if(j == i){
                    inner.add(exist.get(j-1));
                    continue;
                }

                inner.add(exist.get(j-1) + exist.get(j));
            }

            outer.add(inner);
        }


        return outer;
    }

    public static void main(String[] args) {

        System.out.println(new PascalTriangle().solve(5));

    }
}
