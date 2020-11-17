package com.cracking.coding.array;

public class Oneway {

    public static void main(String[] args) {
        String s1 = "pales";
        String s2 = "paldd";
        if(Math.abs(s1.length() - s2.length()) > 1) {
            System.out.println(""+false);
            return;
        }
        int[] arr = new int[26];
        int i = 0, j = 0;
        while (i < s1.length() || j < s2.length()) {
            if(i < s1.length())
                arr[s1.charAt(i) - 'a']++;

            if(j < s2.length())
                arr[s2.charAt(j) - 'a']--;
            i++;
            j++;
        }
        int count = 0;
        for(int k = 0; k < arr.length; k++) {

            if(arr[k] != 0)
                count++;

            if(count > 2) {
                System.out.println(""+false);
                return;
            }
        }

        System.out.println(""+true);
    }
}
