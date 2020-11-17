package com.cracking.coding.array;

public class CheckPermutation {

    public boolean permutation(String s1, String s2) {

        if(s1.length() != s2.length())
            return false;

        int[] arr = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i : arr)
            if(i != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        CheckPermutation checkPermutation = new CheckPermutation();
        boolean resp = checkPermutation.permutation("sriram","ramsri");
        System.out.println(resp);
        resp = checkPermutation.permutation("sriram","ram");
        System.out.println(resp);
        resp = checkPermutation.permutation("sriram","srisri");
        System.out.println(resp);
        resp = checkPermutation.permutation("abcde","edcab");
        System.out.println(resp);
    }
}
