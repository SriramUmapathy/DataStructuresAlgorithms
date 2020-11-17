package com.cracking.coding.array;

public class StringCompression {

    public static void main(String[] args) {
        String str = "AAaabcd";
        int i = 0, j = 0;
        String out = "";
        while (i < str.length()) {
            j = i+1;
            int count = 1;
            while(j < str.length()) {

                if(str.charAt(j) == str.charAt(j-1))
                    j++;
                else
                    break;

                count++;
            }
            out += str.charAt(i)+""+count;
            i = j;
        }
        System.out.println(out);
    }
}
