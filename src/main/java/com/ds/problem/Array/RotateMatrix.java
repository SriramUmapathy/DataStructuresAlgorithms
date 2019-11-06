package com.ds.problem.Array;

import java.util.ArrayList;

public class RotateMatrix {

    public void rotate(ArrayList<ArrayList<Integer>> a) {

        int N = a.size();

        for (int x = 0; x < N / 2; x++)
        {
            for (int y = x; y < N-x-1; y++)
            {
                int temp2 = a.get(N-1-y).get(x);

                a.get(N-1-y).set(x, a.get(N-1-x).get(N-1-y));

                a.get(N-1-x).set(N-1-y, a.get(y).get(N-1-x));

                a.get(y).set(N-1-x, a.get(x).get(y));

                a.get(x).set(y, temp2);

            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + a.get(i).get(j));

            System.out.print("\n");
        }
        System.out.print("\n");

    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        inner.add(1);
        inner.add(2);
        inner.add(3);
        outer.add(inner);

        inner = new ArrayList<>();
        inner.add(4);
        inner.add(5);
        inner.add(6);
        outer.add(inner);

        inner = new ArrayList<>();
        inner.add(7);
        inner.add(8);
        inner.add(9);
        outer.add(inner);

        int N = outer.size();
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + outer.get(i).get(j));

            System.out.print("\n");
        }
        System.out.print("\n");


        new RotateMatrix().rotate(outer);
    }
}
