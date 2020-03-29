package com.test;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Testing {

    public static void main(String[] args) {

        String gamefield = new String();
        gamefield = ",X,X,X,X,X,X,X,/,,X,X,X,X,X,,/,,,X,X,X,,,/,,,,,,,,/,,,,,,,,/,,,,,,,,/,,,X,X,X,,,/,,X,X,X,X,X,,/,X,X,X,X,X,X,X,";


        int[][] fieldArray = Pattern.compile("/").splitAsStream(gamefield).map(r -> Stream.of(r.split(",", -1)).mapToInt(String::length).toArray()).toArray(int[][]::new);


        System.out.println(fieldArray.length);
    }


}
