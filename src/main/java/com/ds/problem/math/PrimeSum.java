package com.ds.problem.math;

import java.util.ArrayList;

public class PrimeSum {



    public ArrayList<Integer> primesum(int A) {

        boolean[] prime = new boolean[A+1];

        prime[0] = prime[1] = true;

        for(int i = 2; i < A; i++) {
            if(!prime[i]) {
                for(int p = i * i; p > 0 &&  p < A; p += i) {
                    prime[p] = true;

                }
            }
        }

        for (int i = 0; i < A; i++)
        {
            if (!prime[i] && !prime[A - i])
            {
//                System.out.print(i + " " + (A - i));
                ArrayList<Integer> input = new ArrayList<>();
                input.add(i);
                input.add(A-i);
                return input;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(new PrimeSum().primesum(1048574));
//        System.out.println(new PrimeSum().primesum(1024));
//        System.out.println(new PrimeSum().primesum(66));
//        System.out.println(new PrimeSum().primesum(9990));
//        System.out.println(new PrimeSum().primesum(4));


    }
}
