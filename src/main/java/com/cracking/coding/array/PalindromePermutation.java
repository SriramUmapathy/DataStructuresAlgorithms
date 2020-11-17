package com.cracking.coding.array;

public class PalindromePermutation {

    public static void main(String[] args) {

        String input = "Tact Coa";
        int[] arr = new int[26];
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); i++) {
            if((input.charAt(i) >= 'a' && input.charAt(i) <= 'z'))
                arr[input.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1)
                count++;
            if(count > 1) {
                System.out.println(""+false);
                return;
            }
        }
        System.out.println(""+true);
    }
}
