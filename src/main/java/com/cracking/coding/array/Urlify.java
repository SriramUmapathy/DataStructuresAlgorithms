package com.cracking.coding.array;

public class Urlify {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Mr John Smith    ");
//        String str = "Mr John Smith    ";

        int i = str.length() - 1;

        while (i > 0) {
            if(str.charAt(i) != ' ')
                break;
            i--;
        }

        int j = str.length() - 1;

        while (i >= 0) {
            if(str.charAt(i) != ' '){
                str.setCharAt(j--,str.charAt(i));
            }else {
                str.setCharAt(j--,'0');
                str.setCharAt(j--,'2');
                str.setCharAt(j--,'%');
            }
            i--;
        }

        System.out.println(str);
    }

}
