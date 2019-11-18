package com.ds.problem.math;

public class PalindromeInteger {

    public static void main(String[] args) {

        int a = 101;

        String str = String.valueOf(a);

        for(int i = 0; i < str.length()/2; i++) {

            if(str.charAt(i) != str.charAt(str.length() - i -1)){
                System.out.println("false");
            }

        }
        System.out.println("true");
    }
}
