package com.ds.problem.Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {


    public int repeatedNumber(final List<Integer> A) {

        int[] n = new int[A.size()+1];


        for(int i = 0; i < A.size(); i++) {

            n[A.get(i)] = n[A.get(i)] + 1;

            if(n[A.get(i)] > 1) {
                return A.get(i);
            }

        }

        return -1;
    }

    public static void main(String[] args) {


        ArrayList<Integer> A = new ArrayList<>();

        A.add(3);
        A.add(4);
        A.add(1);
        A.add(4);
        A.add(1);

        System.out.println(new FindDuplicatesInArray().repeatedNumber(A));
    }
}
