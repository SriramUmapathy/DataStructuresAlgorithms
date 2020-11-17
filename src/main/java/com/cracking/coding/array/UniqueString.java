package com.cracking.coding.array;

public class UniqueString {

    public boolean checkUniqueinLowerCase(String str) {
        int[] arr = new int[26];

        for(char c : str.toCharArray()) {
            arr[c - 'a']++;
            if(arr[c - 'a'] > 1)
                return false;
        }

        return true;
    }

    public boolean checkUniqueinLowerCase1(String str) {
        int checker = 0;

        for(char c : str.toCharArray()) {
            int val = c - 'a';
            if((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String arg[]) {
        UniqueString uniqueString = new UniqueString();
        System.out.println("true = "+uniqueString.checkUniqueinLowerCase(""));
        System.out.println("true = "+uniqueString.checkUniqueinLowerCase("sri"));
        System.out.println("false = "+uniqueString.checkUniqueinLowerCase1("sriram"));
    }

}
